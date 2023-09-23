package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.repository.UsuarioRepository;
import com.algaworks.algafood.domain.exception.NegocioException;
import com.algaworks.algafood.domain.exception.UsuarioNaoEncontradoException;
import com.algaworks.algafood.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscarOuFalhar(Long idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new UsuarioNaoEncontradoException(idUsuario));
    }

    @Transactional
    public Usuario save(Usuario usuario) {
        usuarioRepository.detach(usuario);

        Optional<Usuario> usuarioExistente = usuarioRepository.findUsuarioByEmail(usuario.getEmail());

        if(usuarioExistente.isPresent() && !usuarioExistente.get().getId().equals(usuario.getId()))
            throw new NegocioException(
                    String.format("Já existe um usuário cadastrado com email %s", usuario.getEmail()));

        return usuarioRepository.save(usuario);
    }

    @Transactional
    public void alterarSenha(Long usuarioId, String senhaAtual, String novaSenha) {
        Usuario usuario = buscarOuFalhar(usuarioId);

        if (usuario.senhaNaoCoincideCom(senhaAtual))
            throw new NegocioException("Senha atual informada não coincide com a senha do usuário.");

        usuario.setSenha(novaSenha);
    }
}

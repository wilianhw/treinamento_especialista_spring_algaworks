package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.Repository.UsuarioRepository;
import com.algaworks.algafood.domain.exception.UsuarioNaoEncontradoException;
import com.algaworks.algafood.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscarOuFalhar(Long idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new UsuarioNaoEncontradoException(idUsuario));
    }
}

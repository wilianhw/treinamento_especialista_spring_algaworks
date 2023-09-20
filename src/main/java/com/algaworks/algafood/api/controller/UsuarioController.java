package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.api.assembler.UsuarioModelAssembler;
import com.algaworks.algafood.api.model.UsuarioModel;
import com.algaworks.algafood.domain.Repository.UsuarioRepository;
import com.algaworks.algafood.domain.model.Usuario;
import com.algaworks.algafood.domain.service.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioModelAssembler usuarioModelAssembler;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CadastroUsuarioService cadastroUsuarioService;

    @GetMapping
    public List<UsuarioModel> listar() {
        List<Usuario> usuarioList = usuarioRepository.findAll();

        return usuarioModelAssembler.toCollectionModel(usuarioList);
    }

    @GetMapping("/{idUsuario}")
    public UsuarioModel buscar(@PathVariable Long idUsuario) {
        Usuario usuario = cadastroUsuarioService.buscarOuFalhar(idUsuario);

        return usuarioModelAssembler.toModel(usuario);
    }
}

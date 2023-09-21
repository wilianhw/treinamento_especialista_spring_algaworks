package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.api.assembler.UsuarioInputDisassembler;
import com.algaworks.algafood.api.assembler.UsuarioModelAssembler;
import com.algaworks.algafood.api.model.UsuarioModel;
import com.algaworks.algafood.api.model.input.UsuarioComSenhaInput;
import com.algaworks.algafood.api.model.input.UsuarioInput;
import com.algaworks.algafood.domain.Repository.UsuarioRepository;
import com.algaworks.algafood.domain.model.Usuario;
import com.algaworks.algafood.domain.service.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioModelAssembler usuarioModelAssembler;
    @Autowired
    private UsuarioInputDisassembler usuarioInputDisassembler;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel adicionar(@RequestBody @Valid UsuarioComSenhaInput usuarioComSenhaInput) {
        Usuario usuario = usuarioInputDisassembler.toDomainObject(usuarioComSenhaInput);

        usuario = cadastroUsuarioService.save(usuario);

        return usuarioModelAssembler.toModel(usuario);
    }

    @PutMapping("/{usuarioId}")
    public UsuarioModel atualizar(
            @PathVariable Long usuarioId,
            @RequestBody @Valid UsuarioInput usuarioInput
    ) {
        Usuario usuario = cadastroUsuarioService.buscarOuFalhar(usuarioId);

        usuarioInputDisassembler.copyToDomainObject(usuarioInput, usuario);

        usuario = cadastroUsuarioService.save(usuario);

        return usuarioModelAssembler.toModel(usuario);
    }
}

package com.algaworks.algafood.domain.exception;

public class UsuarioNaoEncontradoException extends EntidadeNaoEncontradaException{
    public UsuarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public UsuarioNaoEncontradoException(Long idUsuario) {
        this(String.format("Não existe cadastro de usuário com código %d", idUsuario));
    }
}

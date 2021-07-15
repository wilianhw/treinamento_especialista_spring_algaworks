package com.algaworks.algafood.domain.exception;

public abstract class EntidadeEmUsoException extends NegocioException {

    public EntidadeEmUsoException(String mensagem) {
        super(mensagem);
    }

}

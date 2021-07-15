package com.algaworks.algafood.domain.exception;

public class EstadoEmUsoException extends EntidadeEmUsoException {

    public EstadoEmUsoException(String mensagem) {
        super(mensagem);
    }

    public EstadoEmUsoException(Long estadoId) {
        this(String.format("Estado de código %d não pode ser removida, pois está em uso", estadoId));
    }
}

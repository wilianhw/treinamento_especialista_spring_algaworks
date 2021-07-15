package com.algaworks.algafood.domain.exception;

public class CozinhaEmUsoException extends EntidadeEmUsoException {

    public CozinhaEmUsoException(String mensagem) {
        super(mensagem);
    }

    public CozinhaEmUsoException(Long cozinhaId) {
        this(String.format("Cozinha de código %d não pode ser removida, pois está em uso", cozinhaId));
    }
}

package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "forma_pagamento_id_seq")
    @SequenceGenerator(name = "forma_pagamento_id_seq", sequenceName = "forma_pagamento_id_seq", allocationSize = 1)
    private Long id;

    private String descricao;
}

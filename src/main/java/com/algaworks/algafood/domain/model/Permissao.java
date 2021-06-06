package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permissao_id_seq")
    @SequenceGenerator(name = "permissao_id_seq", sequenceName = "permissao_id_seq", allocationSize = 1)
    private Long id;

    private String nome;

    private String descricao;
}

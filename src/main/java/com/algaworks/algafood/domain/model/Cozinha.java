package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cozinha_id_seq")
    @SequenceGenerator(name = "cozinha_id_seq", sequenceName = "cozinha_id_seq", allocationSize = 1)
    private Long id;

    private String nome;

}

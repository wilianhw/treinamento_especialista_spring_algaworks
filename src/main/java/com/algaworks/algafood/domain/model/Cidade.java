package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cidade_id_seq")
    @SequenceGenerator(name = "cidade_id_seq", sequenceName = "cidade_id_seq", allocationSize = 1)
    private Long id;

    private String nome;

    @ManyToOne
    private Estado estado;
}

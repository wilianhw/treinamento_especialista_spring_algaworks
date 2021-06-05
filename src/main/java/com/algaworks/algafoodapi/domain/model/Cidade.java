package com.algaworks.algafoodapi.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Estado estado;
}

package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_id_seq")
    @SequenceGenerator(name = "estado_id_seq", sequenceName = "estado_id_seq", allocationSize = 1)
    private Long id;

    private String nome;
}

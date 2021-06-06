package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurante_id_seq")
    @SequenceGenerator(name = "restaurante_id_seq", sequenceName = "restaurante_id_seq", allocationSize = 1)
    private Long id;

    private String nome;

    private BigDecimal taxaFrete;

    @ManyToOne
    private Cozinha cozinha;

}

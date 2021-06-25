package com.algaworks.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cozinha_id_seq")
    @SequenceGenerator(name = "cozinha_id_seq", sequenceName = "cozinha_id_seq", allocationSize = 1)
    private Long id;

    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "cozinha")
    private List<Restaurante> restaurantes = new ArrayList<>();

}

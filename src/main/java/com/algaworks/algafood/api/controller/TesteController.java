package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.Repository.RestauranteRepository;
import com.algaworks.algafood.domain.model.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class TesteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/restaurantes/por-nome-e-frete")
    public List<Restaurante> restaurantesPorNomeFrete(String nome,
                                                      BigDecimal taxaFreteInicial,
                                                      BigDecimal taxaFreteFinal) {
        return restauranteRepository.find(nome, taxaFreteInicial, taxaFreteFinal);
    }

}

package com.miage.altea.tp.pokemon_ui.service;


import com.miage.altea.tp.pokemon_ui.bo.PokemonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {

    RestTemplate restTemplate = new RestTemplate();
    String pokemonServiceUrl = "http://localhost:8080/pokemon-types";


    public List<PokemonType> listPokemonsTypes(){

        PokemonType[] response = restTemplate.getForObject(
                "http://localhost:8080/pokemon-types/",
                PokemonType[].class
        );

        System.out.println(response);
        List<PokemonType> pokemonTypes = Arrays.asList(response);
        return pokemonTypes;
    }

    @Autowired
    void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    void setPokemonTypeServiceUrl(String pokemonServiceUrl) {
        this.pokemonServiceUrl = pokemonServiceUrl;
    }
}
package com.isoft.pokeapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
}

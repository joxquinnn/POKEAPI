package com.isoft.pokeapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isoft.pokeapi.dto.ResponseTypeDominanceDTO;
import com.isoft.pokeapi.service.PokemonService;

@RestController 
@RequestMapping("/pokemon")
public class PokemonController {
    
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    @GetMapping("/type-dominance/{type}")
    public List<ResponseTypeDominanceDTO> PokemonTypeDominance(@PathVariable ("type") String tipo) {
        return pokemonService.obtenerPokemonsPorTipo(tipo);
    }
}

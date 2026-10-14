package com.isoft.pokeapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isoft.pokeapi.service.PokemonService;
import com.isoft.pokeapi.dto.ResponseWeakDefenseDTO;

@RestController 
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    @GetMapping("/weak-defense")
    public List<ResponseWeakDefenseDTO> obtenerPokemonsDebiles(){
         return pokemonService.pokemonsDebiles();
    }
}

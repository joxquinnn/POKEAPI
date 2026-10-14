package com.isoft.pokeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isoft.pokeapi.dto.evolutionchain.APIEvolutionChainDTO;
import com.isoft.pokeapi.dto.pokemon.APIPokemonChainBaseDTO;
import com.isoft.pokeapi.dto.response.ResponsePokemonChainEvolutionDTO;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponsePokemonChainEvolutionDTO obtenerEvolucionPorId(int id) {
        ResponsePokemonChainEvolutionDTO evolucionesObtenidas = null;

        for (int i = 1; i <= id; i++) {
            String pokemonEvolutionChainURL = "https://pokeapi.co/api/v2/evolution-chain/" + i;
            String pokemonBaseURL = "https://pokeapi.co/api/v2/pokemon/" + i;
            APIEvolutionChainDTO pokemonEvolution = restTemplate.getForObject(pokemonEvolutionChainURL, APIEvolutionChainDTO.class);
            APIPokemonChainBaseDTO pokemonBase = restTemplate.getForObject(pokemonBaseURL, APIPokemonChainBaseDTO.class);
 
            //obtener el nombre del pokemon
            List<APIPokemonChainBaseDTO> pokemonDatas = new ArrayList<>();
            for(APIPokemonChainBaseDTO pokemonData : pokemonDatas){
                String pokemonName = pokemonData.getName();
            }

            //
            int contadorOrden = 0;
            List<APIEvolutionChainDTO> evoluciones = new ArrayList<>();
            for(APIEvolutionChainDTO evolucion : evoluciones){       
            }            
        }
        return evolucionesObtenidas;
    }
}

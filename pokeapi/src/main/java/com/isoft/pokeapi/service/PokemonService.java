package com.isoft.pokeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isoft.pokeapi.dto.APIPokemonDTO;
import com.isoft.pokeapi.dto.APIPokemonTypeDTO;
import com.isoft.pokeapi.dto.PokemonExperimentadoDTO;
import com.isoft.pokeapi.dto.ResponseTypeDominanceDTO;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<ResponseTypeDominanceDTO> obtenerPokemonsPorTipo(String tipo) {
        List<ResponseTypeDominanceDTO> PokemonsObtenidos = new ArrayList<>();
        PokemonExperimentadoDTO pokemon_mas_experimentado = null;
        int mayor_base_experience = 0;
        int total_pokemon = 0;

        // recorrer primera generación
        for (int i = 1; i <= 151; i++) {
            String url = "https://pokeapi.co/api/v2/pokemon/" + i;
            APIPokemonDTO pokemonObtenido = restTemplate.getForObject(url, APIPokemonDTO.class);

            List<APIPokemonTypeDTO> tipos = pokemonObtenido.getTypes();

            for (APIPokemonTypeDTO tipopokemon : tipos) {
                String nombreTipo = tipopokemon.getType().getName();

                if (tipo.equals(nombreTipo)) {
                    total_pokemon++;

                    if (pokemonObtenido.getBase_experience() > mayor_base_experience) {
                        mayor_base_experience = pokemonObtenido.getBase_experience();
                        pokemon_mas_experimentado = new PokemonExperimentadoDTO(pokemonObtenido.getId(),
                                pokemonObtenido.getName(), pokemonObtenido.getBase_experience());

                    }
                }
            }
        }
        ResponseTypeDominanceDTO pokemonsPorTipo = new ResponseTypeDominanceDTO(tipo, total_pokemon, pokemon_mas_experimentado);
        PokemonsObtenidos.add(pokemonsPorTipo);
        
        return PokemonsObtenidos;
    }
}

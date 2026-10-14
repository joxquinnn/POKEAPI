package com.isoft.pokeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isoft.pokeapi.dto.evolutionchain.APIEvolutionChainDTO;
import com.isoft.pokeapi.dto.pokemon.APIPokemonChainBaseDTO;
import com.isoft.pokeapi.dto.response.ResponsePokemonChainEvolutionDTO;

@Service
import com.isoft.pokeapi.dto.PokemonBaseDTO;
import com.isoft.pokeapi.dto.PokemonTypesDTO;
import com.isoft.pokeapi.dto.ResponseWeakDefenseDTO;
import com.isoft.pokeapi.dto.StatsDetailsDTO;

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
    public List<ResponseWeakDefenseDTO> pokemonsDebiles() {
        List<ResponseWeakDefenseDTO> masDebiles = new ArrayList<>();

        for (int i = 1; i <= 150; i++) {
            String url = "https://pokeapi.co/api/v2/pokemon/" + i;
            PokemonBaseDTO pokemonRecibido = restTemplate.getForObject(url, PokemonBaseDTO.class);

            List<StatsDetailsDTO> estadisticas = pokemonRecibido.getStats();
            List<String> tiposPokemon = new ArrayList<>(); 
            List<PokemonTypesDTO> tipos = pokemonRecibido.getTypes();

            int defense = 0;
            int sp_defense = 0;
            
            for (StatsDetailsDTO estadistica : estadisticas) {
                String nombreStat = estadistica.getStat().getName();

                if (nombreStat.equals("defense")) {
                    defense = estadistica.getBase_stat();
                } else if (nombreStat.equals("special-defense")) {
                    sp_defense = estadistica.getBase_stat();
                }                
            }

            for(PokemonTypesDTO tipo : tipos ) {
                String nombreTipo = tipo.getType().getName();
                tiposPokemon.add(nombreTipo);
            }

            if (sp_defense < 40 && defense < 40) {
                ResponseWeakDefenseDTO pokemonDebil = new ResponseWeakDefenseDTO(pokemonRecibido.getId(), pokemonRecibido.getName(), defense, sp_defense, tiposPokemon);
                masDebiles.add(pokemonDebil);
            }
        }
        return masDebiles; 
    }
}

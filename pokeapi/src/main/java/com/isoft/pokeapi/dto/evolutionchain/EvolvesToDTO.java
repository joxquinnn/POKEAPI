package com.isoft.pokeapi.dto.evolutionchain;

import com.isoft.pokeapi.dto.pokemonspecies.APIPokemonSpeciesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString 
public class EvolvesToDTO {
    private APIPokemonSpeciesDTO species;
    private EvolutionDetailsDTO evolution_details;
}

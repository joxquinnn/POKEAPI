package com.isoft.pokeapi.dto;

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
public class ResponseTypeDominanceDTO {
    private String tipo;
    private int total_pokemon;
    private PokemonExperimentadoDTO pokemon_mas_experimentado;
}

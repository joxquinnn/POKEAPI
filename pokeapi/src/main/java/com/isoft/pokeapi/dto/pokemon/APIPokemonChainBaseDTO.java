package com.isoft.pokeapi.dto.pokemon;

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
public class APIPokemonChainBaseDTO {
    private int id;
    private String name;
    private APIPokemonChainBaseSpeciesDTO species;
}

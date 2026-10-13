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
public class APIPokemonTypeDTO {
    private int slot;
    private APITypeDTO type;
}

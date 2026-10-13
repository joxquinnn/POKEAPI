package com.isoft.pokeapi.dto;

import java.util.List;

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
public class APIPokemonDTO {
    private int id;
    private String name;
    private int base_experience;
    private List<APIPokemonTypeDTO> types;
}

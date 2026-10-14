package com.isoft.pokeapi.dto.response;

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
public class ResponsePokemonChainEvolutionDTO {
    private String pokemon_base;
    private List<CadenaDTO> cadena;
}

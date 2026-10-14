package com.isoft.pokeapi.dto.response;

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
public class CadenaDTO {
    private String nombre;
    private int orden;
    private Integer min_level;
}

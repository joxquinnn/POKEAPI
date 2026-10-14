package com.isoft.pokeapi.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString 
public class ResponseWeakDefenseDTO {
    private int id;
    private String name;
    private int defense;
    private int sp_defense;
    private List<String> tipos;
}

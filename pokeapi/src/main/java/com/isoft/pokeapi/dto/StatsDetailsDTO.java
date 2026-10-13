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
public class StatsDetailsDTO {
    private int base_stat;
    private int effort;
    private StatDTO stat;
}

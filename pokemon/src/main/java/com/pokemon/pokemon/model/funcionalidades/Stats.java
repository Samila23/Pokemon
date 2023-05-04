package com.pokemon.pokemon.model.funcionalidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Stats {
	  private int base_stat;
	  private int effort;
	//  private int weight;	
	  private Stat stat; 
}

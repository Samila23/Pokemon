package com.pokemon.pokemon.model.consultaInformacoes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties
public class Stats {
	  private int base_stat;
	  private int effort;
	  private int weight;	
	  private Stat stat; 
}

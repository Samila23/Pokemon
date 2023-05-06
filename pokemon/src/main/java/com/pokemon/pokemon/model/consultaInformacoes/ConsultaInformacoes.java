package com.pokemon.pokemon.model.consultaInformacoes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties
public class ConsultaInformacoes {
	  private int id;
	  private String name;
	  private int height;
	  private int weight;	  
	  private String location_area_encounters; 
	  private List<Stats> stats;
	  private List<Types> types;
	  private Species species;
	  
	  
}

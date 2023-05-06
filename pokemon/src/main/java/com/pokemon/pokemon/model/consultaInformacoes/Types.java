package com.pokemon.pokemon.model.consultaInformacoes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties
public class Types {
	  private int slot;
	  private Type type;
}

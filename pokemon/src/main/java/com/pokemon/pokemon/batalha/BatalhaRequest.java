package com.pokemon.pokemon.batalha;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties
public class BatalhaRequest {
	  private String challenger;
	  private String challenged;
}

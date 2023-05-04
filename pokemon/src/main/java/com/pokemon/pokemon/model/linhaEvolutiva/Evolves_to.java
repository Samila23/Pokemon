package com.pokemon.pokemon.model.linhaEvolutiva;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pokemon.pokemon.model.consultaInformacoes.Species;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Evolves_to {
	  private Species2 species;
}

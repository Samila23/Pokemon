package com.pokemon.pokemon.model.linhaEvolutiva;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Chain {

	private List<Evolves_to> evolves_to;
	private Species1 species;
}

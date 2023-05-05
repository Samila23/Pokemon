package com.pokemon.pokemon.model.linhaEvolutiva;

import java.util.List;

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
	private List<Evolves_to> evolves_to;
	private Species species;
}

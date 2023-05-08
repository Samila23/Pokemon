package com.pokemon.pokemon.model.linhaEvolutiva;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pokemon.pokemon.model.consultaInformacoes.Species;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties
public class Evolves_to {
	private List<Evolves_to> evolves_to;
	private Species species;
}

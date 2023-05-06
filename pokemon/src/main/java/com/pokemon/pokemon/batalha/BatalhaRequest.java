package com.pokemon.pokemon.batalha;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pokemon.pokemon.model.consultaInformacoes.Species;
import com.pokemon.pokemon.model.consultaInformacoes.Stats;
import com.pokemon.pokemon.model.consultaInformacoes.Types;

import lombok.AllArgsConstructor;
import lombok.Data;
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

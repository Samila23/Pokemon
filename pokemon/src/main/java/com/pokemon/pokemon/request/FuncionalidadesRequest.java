package com.pokemon.pokemon.request;

import org.modelmapper.ModelMapper;

import com.pokemon.pokemon.model.consultaInformacoes.ConsultaInformacoes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionalidadesRequest {
	  private String name;
	  
		public ConsultaInformacoes toModelEstoque() {											// Ele irá converter apenas os ATRIBUTOS em COMUM das CLASSES
			ModelMapper mapper = new ModelMapper();
			return mapper.map(this, ConsultaInformacoes.class);
		}
}

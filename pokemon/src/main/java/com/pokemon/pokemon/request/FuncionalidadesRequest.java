package com.pokemon.pokemon.request;

import org.modelmapper.ModelMapper;

import com.pokemon.pokemon.model.funcionalidades.Funcionalidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionalidadesRequest {
	  private String name;
	  
		public Funcionalidades toModelEstoque() {											// Ele irá converter apenas os ATRIBUTOS em COMUM das CLASSES
			ModelMapper mapper = new ModelMapper();
			return mapper.map(this, Funcionalidades.class);
		}
}

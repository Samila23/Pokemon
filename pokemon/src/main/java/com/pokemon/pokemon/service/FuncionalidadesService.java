package com.pokemon.pokemon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pokemon.pokemon.model.funcionalidades.Funcionalidades;
@Service
public class FuncionalidadesService {
    private final String URL = "https://pokeapi.co";
    private final String URI = "/api/v2/pokemon/";
    
    
    public Funcionalidades retornaDadosFuncionalidades(String name) {
    	
    	Funcionalidades funcionalidades = new Funcionalidades();
    	
    	funcionalidades =  WebClient
                .create(URL)
                .get()
                .uri(URI + "/{id}", name)
                .retrieve()
                .bodyToMono(Funcionalidades.class).block();
    	return funcionalidades;

    }
    
	public Funcionalidades getOne(String name) {
		Funcionalidades funcionalidades = retornaDadosFuncionalidades(name);
		return funcionalidades;
	}

}

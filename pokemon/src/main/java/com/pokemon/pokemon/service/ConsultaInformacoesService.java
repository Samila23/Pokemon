package com.pokemon.pokemon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pokemon.pokemon.model.consultaInformacoes.ConsultaInformacoes;
import com.pokemon.pokemon.model.consultaInformacoes.Stats;
@Service
public class ConsultaInformacoesService {
    private final String URL = "https://pokeapi.co";
    private final String URI = "/api/v2/pokemon/";
    
    
    public ConsultaInformacoes retornaDadosFuncionalidades(String name) {
    	
    	ConsultaInformacoes funcionalidades = new ConsultaInformacoes();
    	
    	funcionalidades =  WebClient
                .create(URL)
                .get()
                .uri(URI + "/{id}", name)
                .retrieve()
                .bodyToMono(ConsultaInformacoes.class).block();
    	return funcionalidades;

    }
    
	public ConsultaInformacoes getOneConsultaInformacoes(String name) {
		ConsultaInformacoes funcionalidades = retornaDadosFuncionalidades(name);
		for (Stats emprestimo : funcionalidades.getStats()) {
			int i = 0;
			emprestimo.setBase_stat(funcionalidades.getStats().get(i).getBase_stat());
			System.out.println(emprestimo.getBase_stat());
		}
		return funcionalidades;
	}

}

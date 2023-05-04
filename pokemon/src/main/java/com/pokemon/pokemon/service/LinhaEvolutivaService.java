package com.pokemon.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pokemon.pokemon.model.linhaEvolutiva.Forms;
import com.pokemon.pokemon.model.linhaEvolutiva.UrlEvolution_chain;
import com.pokemon.pokemon.model.linhaEvolutiva.UrlLinhaEvolutiva;

@Service
public class LinhaEvolutivaService {
	@Autowired
	ConsultaInformacoesService consultaInformacoesService;
	private final String URL = "https://pokeapi.co";

    public UrlLinhaEvolutiva retornaUrlEvolution_chain(String name) {
        final String URI = "/api/v2/pokemon-species/";
    	
        UrlLinhaEvolutiva urlEvolution_chain = new UrlLinhaEvolutiva();
    	
    	urlEvolution_chain =  WebClient
                .create(URL)
                .get()
                .uri(URI + "/{id}", name)
                .retrieve()
                .bodyToMono(UrlLinhaEvolutiva.class).block();
    	return urlEvolution_chain;

    }
	
    public Forms retornaLinhaEvolutiva(int path) {
        final String URI = "api/v2/evolution-chain/";
    	
        Forms forms = new Forms();
    	
        forms =  WebClient
                .create(URL)
                .get()
                .uri(URI + "{id}", path)
                .retrieve()
                .bodyToMono(Forms.class).block();
    	return forms;

    }
	
	public Forms getOneLinhaEvolutiva(String name) {
		UrlLinhaEvolutiva urlEvolution_chain = retornaUrlEvolution_chain(name);
		String a = urlEvolution_chain.getEvolution_chain().getUrl();
		String path = a.substring(42 , a.length() - 1);
		Forms forms = retornaLinhaEvolutiva(Integer.parseInt(path));
		return forms;
	}
}

package com.pokemon.pokemon.model.linhaEvolutiva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.pokemon.pokemon.model.consultaInformacoes.Species;

@ExtendWith(SpringExtension.class)																			//Informa que é uma classe de testes 
@AutoConfigureMockMvc																						//Sempre que usar o MockMVC
@SpringBootTest
public class LinhaEvolutivaModelTest {
	
	@InjectMocks
	private LinhaEvolutiva linhaEvolutiva;
	@InjectMocks
	private Forms forms;
	@InjectMocks
	private Chain chain;
	@InjectMocks
	private Evolves_to evolves_to;
	@InjectMocks
	private Species species;
	@InjectMocks
	private UrlLinhaEvolutiva urlLinhaEvolutiva;
	@InjectMocks
	private UrlEvolution_chain urlEvolution_chain;
	
	@Test
	void testLinhaEvolutiva() {
		linhaEvolutiva.setForms(null);
		linhaEvolutiva.getForms();
		chain.setEvolves_to(null);
		chain.getEvolves_to();
		chain.setSpecies(species);
		chain.getSpecies();
		species.setName("teste");
		species.getName();
		species.setUrl("teste");
		species.getUrl();
	}
	
	@Test
	void testForms() {
		forms.setChain(chain);
		forms.getChain();
	}
	
	@Test
	void testChain() {
		chain.setEvolves_to(null);
		chain.getEvolves_to();
		chain.setSpecies(species);
		chain.getSpecies();
	}
	
	@Test
	void testEvolves_to() {
		evolves_to.setEvolves_to(null);
		evolves_to.getEvolves_to();
		evolves_to.setSpecies(species);
		evolves_to.getSpecies();
	}

	@Test
	void testSpecies(){
		species.setName("teste");
		species.setUrl("teste");
		species.getName();
		species.getUrl();
	}
	
	@Test
	void testUrlLinhaEvolutiva() {
		urlLinhaEvolutiva.setEvolution_chain(urlEvolution_chain);
		urlLinhaEvolutiva.getEvolution_chain();
	}
	
	@Test
	void testUrlEvolution_chain() {
		urlEvolution_chain.setUrl("teste");
		urlEvolution_chain.getUrl();
	}
	
	
}

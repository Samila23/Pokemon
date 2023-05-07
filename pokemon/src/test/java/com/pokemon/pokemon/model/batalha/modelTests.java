package com.pokemon.pokemon.model.batalha;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)																			//Informa que é uma classe de testes 
@AutoConfigureMockMvc																						//Sempre que usar o MockMVC
@SpringBootTest
public class modelTests {
	@InjectMocks
	BatalhaRequest batalhaRequest;
	
	@InjectMocks
	BatalhaResponse batalhaResponse; 
	
	@Test
	public void testBatalhaRequest(){
		batalhaRequest.getChallenged();
		batalhaRequest.getChallenger();
		batalhaRequest.setChallenged("teste");
		batalhaRequest.setChallenger("teste");
	}
	
	@Test
	public void testBatalhaResponse(){
		batalhaResponse.getWinner();
		batalhaResponse.setWinner("teste");
	}
}

package com.pokemon.pokemon.batalha;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokemon.pokemon.model.batalha.BatalhaRequest;


@ExtendWith(SpringExtension.class)																			 
@AutoConfigureMockMvc																						
@SpringBootTest
public class BatalhaTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test																									
	void batalhaChallenger() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		BatalhaRequest batalhaRequest = new BatalhaRequest();
		batalhaRequest.setChallenged("pikachu");
		batalhaRequest.setChallenger("venusaur");
		
		ResultActions response = mockMvc.perform (
				post("/batalha")
				.content( mapper.writeValueAsString(batalhaRequest))
				.contentType("application/json")
				);
	
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();
		System.out.println(responseStr);
		assertThat(responseStr);

	}
	
	@Test																									
	void batalhaEmpateTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		BatalhaRequest batalhaRequest = new BatalhaRequest();
		batalhaRequest.setChallenged("pikachu");
		batalhaRequest.setChallenger("pikachu");
		
		ResultActions response = mockMvc.perform (
				post("/batalha")
				.content( mapper.writeValueAsString(batalhaRequest))
				.contentType("application/json")
				);
	
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();
		System.out.println(responseStr);
		assertThat(responseStr);

	}
	
	@Test																									
	void batalhaChallenged() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		BatalhaRequest batalhaRequest = new BatalhaRequest();
		batalhaRequest.setChallenged("pikachu");
		batalhaRequest.setChallenger("rattata");
		
		ResultActions response = mockMvc.perform (
				post("/batalha")
				.content( mapper.writeValueAsString(batalhaRequest))
				.contentType("application/json")
				);
	
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();
		System.out.println(responseStr);
		assertThat(responseStr);

	}
}

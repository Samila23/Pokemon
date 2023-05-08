package com.pokemon.pokemon.linhaEvolutiva;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

@ExtendWith(SpringExtension.class)																			 
@AutoConfigureMockMvc																						
@SpringBootTest
public class LinhaEvolutivaTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void getOneTest() throws Exception{
		ResultActions response = mockMvc.perform (
				get("/linhaEvolutiva/pikachu")
				.contentType("application/json")
				);
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();
		System.out.println(responseStr);

	}
}

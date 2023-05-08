package com.pokemon.pokemon.consultaInformacoes;

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

@ExtendWith(SpringExtension.class)																			//Informa que é uma classe de testes 
@AutoConfigureMockMvc																						//Sempre que usar o MockMVC
@SpringBootTest
public class ConsultaInformacoesTest {
	@Autowired
	private MockMvc mockMvc;	
	
	@Test
	void getOneTest() throws Exception{
		ResultActions response = mockMvc.perform (
				get("/consultaInformacoes/pikachu")
				.contentType("application/json")
				);
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();
		System.out.println(responseStr);

	}
}

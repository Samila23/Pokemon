package com.pokemon.pokemon.model.consultaInformacoes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)																			//Informa que é uma classe de testes 
@AutoConfigureMockMvc																						//Sempre que usar o MockMVC
@SpringBootTest
public class modelTests {
	@InjectMocks
    private ConsultaInformacoes consultaInformacoes;
	@InjectMocks
	private Species species;
	@InjectMocks
	private Stats stats;
	@InjectMocks
	private Stat stat;
	@InjectMocks
	private Types types;
	@InjectMocks
	private Type type;

	@Test
	public void testConsultaInformacoes(){
		consultaInformacoes.setId(0);
		consultaInformacoes.getId();
		consultaInformacoes.setName("teste");
		consultaInformacoes.getName();
		consultaInformacoes.setHeight(0);
		consultaInformacoes.getHeight();
		consultaInformacoes.setWeight(0);
		consultaInformacoes.getWeight();
		consultaInformacoes.setLocation_area_encounters(null);
		consultaInformacoes.getLocation_area_encounters();
		consultaInformacoes.setSpecies(species);
		consultaInformacoes.getSpecies();
		consultaInformacoes.setStats(null);
		consultaInformacoes.getStats();
		consultaInformacoes.setTypes(null);
		consultaInformacoes.getTypes();
	}
	
	@Test
	public void testSpecies(){
		species.setName("teste");
		species.setUrl("teste");
		species.getName();
		species.getUrl();
	}
	
	@Test
	public void testStat(){
		stat.setName("teste");
		stat.setUrl("teste");
		stat.getName();
		stat.getUrl();
	}
	
	@Test
	public void testStats(){
		stats.setBase_stat(0);
		stats.getBase_stat();
		stats.setEffort(0);
		stats.getEffort();
		stats.setStat(stat);
		stats.getStat();
		stats.setWeight(0);
		stats.getWeight();
	}
	
	@Test
	public void testType(){
		type.setName("teste");
		type.setUrl("teste");
		type.getName();
		type.getUrl();
	}
	
	@Test
	public void testTypes(){
		types.setSlot(0);
		types.getSlot();
		types.setType(type);
		types.getType();
	}
}

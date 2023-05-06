package com.pokemon.pokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.model.consultaInformacoes.ConsultaInformacoes;
import com.pokemon.pokemon.service.ConsultaInformacoesService;

@RestController
@RequestMapping("consultaInformacoes")
public class ConsultaInformacoesController {
	
	@Autowired
	ConsultaInformacoesService consultaInformacoesService;
	@GetMapping("{name}")
	public ConsultaInformacoes getOne(@PathVariable String name) {							
		return consultaInformacoesService.getOneConsultaInformacoes(name);
	}
}

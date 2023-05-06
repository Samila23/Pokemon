package com.pokemon.pokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.batalha.BatalhaRequest;
import com.pokemon.pokemon.batalha.BatalhaResponse;
import com.pokemon.pokemon.service.BatalhaService;

@RestController
@RequestMapping("batalha")
public class BatalhaController {
	@Autowired
	BatalhaService batalhaService;
	
	@PostMapping()
	public BatalhaResponse batalha(@RequestBody BatalhaRequest batalhaRequest) {
		return batalhaService.batalha(batalhaRequest);
	}
	

}

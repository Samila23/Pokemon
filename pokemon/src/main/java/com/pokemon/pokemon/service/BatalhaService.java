package com.pokemon.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.pokemon.batalha.BatalhaRequest;
import com.pokemon.pokemon.batalha.BatalhaResponse;
import com.pokemon.pokemon.model.consultaInformacoes.ConsultaInformacoes;
import com.pokemon.pokemon.model.consultaInformacoes.Stats;

@Service
public class BatalhaService {
	@Autowired
	ConsultaInformacoesService consultaInformacoesService;
	
	public BatalhaResponse batalha(BatalhaRequest batalhaRequest) {
		BatalhaResponse batalhaResponse = new BatalhaResponse();
		//Pegando todas as informações do Desafiado, para poder pegar os Stats.
		ConsultaInformacoes funcionalidadesChallenged = consultaInformacoesService.getOneConsultaInformacoes(batalhaRequest.getChallenged());
		int totalChallenged = 0;
		int totalChallenger = 0;
		int i = 0;
		int j = 0;
		for (Stats stats : funcionalidadesChallenged.getStats()) {
			stats.setBase_stat(funcionalidadesChallenged.getStats().get(i).getBase_stat());
			totalChallenged = totalChallenged + stats.getBase_stat();
			i += 1;
			System.out.println("1 - " + stats.getBase_stat());
		}
		
		//Pegando todas as informações do Desafiador, para poder pegar os Stats.
		ConsultaInformacoes funcionalidadesChallenger = consultaInformacoesService.getOneConsultaInformacoes(batalhaRequest.getChallenger());
		for (Stats stats : funcionalidadesChallenger.getStats()) {
			stats.setBase_stat(funcionalidadesChallenger.getStats().get(j).getBase_stat());
			totalChallenger = totalChallenger + stats.getBase_stat();
			j += 1;
			System.out.println(stats.getBase_stat());
		}
		System.out.println(funcionalidadesChallenged.getName() + " " + totalChallenged);
		System.out.println(funcionalidadesChallenger.getName() + " " + totalChallenger);

		if (totalChallenged > totalChallenger) {
			batalhaResponse.setWinner(funcionalidadesChallenged.getName());
		}
		else if (totalChallenged < totalChallenger) {
			batalhaResponse.setWinner(funcionalidadesChallenger.getName());
		}
		else {
			batalhaResponse.setWinner("Draw");
		}
		return batalhaResponse;
	}
}

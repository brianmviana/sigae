package br.ufc.sigae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.sigae.model.Presenca;
import br.ufc.sigae.model.Usuario;
import br.ufc.sigae.repository.PresencaRepository;


@Service
public class PresencaService {
	@Autowired
	PresencaRepository repo;
	
	public Presenca salvarPresenca(Usuario aluno,boolean status){
		Presenca presenca = new Presenca();
		presenca.setAluno(aluno);
		presenca.setStatus(status);
		repo.save(presenca);
		
		return presenca;
	}
	
	public List<Presenca> getTodasPresencas(){
		return repo.findAll();
	}
	
}

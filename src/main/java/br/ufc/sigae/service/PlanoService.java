package br.ufc.sigae.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.sigae.model.Plano;
import br.ufc.sigae.model.Usuario;
import br.ufc.sigae.repository.PlanoRepository;


@Service
public class PlanoService {
	@Autowired
	PlanoRepository repo;
	
	public Plano salvarPlano(String planoAula,String diario,Date data){
		Plano plano = new Plano();
		plano.setPlano(planoAula);
		plano.setDiario(diario);
		plano.setData(data);
		plano.setPresentes(null);
		repo.save(plano);
		
		return plano;
	}
	
	public List<Plano> getTodosPlanos(){
		return repo.findAll();
	}
	
	public List<Plano> getPlanoPorData(Date data){
		return repo.findByData(data);				
	}
	
	public List<Usuario> getUsuario(Usuario aluno){
		return repo.findByPresentesAluno(aluno);				
	}
}

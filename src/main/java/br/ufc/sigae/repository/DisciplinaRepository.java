package br.ufc.sigae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.sigae.model.Disciplina;
import br.ufc.sigae.model.Usuario;


@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer>{
	
	Disciplina findById(Integer id);
	
	Disciplina findByCodigo(String codigo);
	
}

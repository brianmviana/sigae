package br.ufc.sigae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.sigae.model.Presenca;


@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Integer>{
	
}

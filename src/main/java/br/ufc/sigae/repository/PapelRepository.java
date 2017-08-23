package br.ufc.sigae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.sigae.model.Usuario_papel;

@Repository
public interface PapelRepository extends JpaRepository<Usuario_papel, Long>{
	
}

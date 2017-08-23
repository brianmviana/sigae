package br.ufc.sigae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.sigae.model.Usuario_papel;

public interface Usuario_RoleRepository extends JpaRepository<Usuario_papel, Long> {
	
}

package dev.brianmviana.sigae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.brianmviana.sigae.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

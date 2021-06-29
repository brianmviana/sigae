package dev.brianmviana.sigae.service.interfaces;

import java.util.List;
import java.util.Optional;

import dev.brianmviana.sigae.model.Usuario;

public interface IUsuarioService {

	public Optional<Usuario> save(Usuario user);

	public List<Usuario> findAll();

	public Optional<Usuario> findOne(Long id);

	public Optional<Usuario> update(Usuario user);
	
	public Optional<Usuario> findByLogin(String login);

	public void delete(Long id);
}

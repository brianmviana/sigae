package dev.brianmviana.sigae.service.interfaces;

import java.util.List;

import dev.brianmviana.sigae.model.Usuario;

public interface IUsuarioService {

	public Usuario save(Usuario user);

	public List<Usuario> findAll();

	public Usuario findOne(String username);

	public Usuario update(Usuario user);

	public void delete(String username);
}

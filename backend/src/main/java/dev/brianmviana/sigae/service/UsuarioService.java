package dev.brianmviana.sigae.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.brianmviana.sigae.model.Usuario;
import dev.brianmviana.sigae.repository.UsuarioRepository;
import dev.brianmviana.sigae.service.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	
	private UsuarioRepository userRepository;

	@Override
	public Optional<Usuario> save(Usuario user) {
		Usuario userSaved = userRepository.save(user);
		Optional<Usuario> optUser = Optional.ofNullable(userSaved);
		return optUser;
	}

	@Override
	public List<Usuario> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<Usuario> findOne(Long id) {
		Optional<Usuario> user = userRepository.findById(id);
		return user;
	}

	@Override
	public Optional<Usuario> update(Usuario user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}

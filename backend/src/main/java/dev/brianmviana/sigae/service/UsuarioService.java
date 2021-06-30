package dev.brianmviana.sigae.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import dev.brianmviana.sigae.model.Usuario;
import dev.brianmviana.sigae.repository.UsuarioRepository;
import dev.brianmviana.sigae.service.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario usuario) {
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		// TODO Validar se usuario foi salvo corretamente
		return usuarioSalvo;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Validar nivel de acesso do usuario
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<Usuario> usuariosAtivos = usuarios.stream().filter(user -> user.getStatus()).collect(Collectors.toList());
		return usuariosAtivos;
	}

	@Override
	public Usuario findOne(String username) {
		Optional<Usuario> usuarioOpt = usuarioRepository.findById(username);
		usuarioOpt.ifPresentOrElse((usuario) -> {
			// TODO adicionar validação
		}, () -> {
			throw new EmptyResultDataAccessException(1);
		});
		return usuarioOpt.get();
	}

	@Override
	public Usuario update(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String username) {
		// TODO Validar tipo de usuario
		Usuario usuario = this.findOne(username);
		usuario.setStatus(false);
		usuarioRepository.save(usuario);
	}

}

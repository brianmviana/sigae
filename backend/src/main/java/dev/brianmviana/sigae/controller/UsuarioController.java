package dev.brianmviana.sigae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brianmviana.sigae.model.Usuario;
import dev.brianmviana.sigae.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> index() {
		List<Usuario> usuarios = usuarioService.findAll();
		return (null != usuarios) ? ResponseEntity.ok(usuarios) : ResponseEntity.noContent().build();
	}

	@GetMapping("/{username}")
	public ResponseEntity<Usuario> indexOne(@PathVariable String username) {
		return ResponseEntity.ok(usuarioService.findOne(username));
	}

	@DeleteMapping("/{username}")
	public ResponseEntity<?> delete(@PathVariable String username) {
		usuarioService.delete(username);
		return ResponseEntity.ok().build();
	}
}

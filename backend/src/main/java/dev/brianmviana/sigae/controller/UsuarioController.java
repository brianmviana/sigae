package dev.brianmviana.sigae.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brianmviana.sigae.model.Usuario;
import dev.brianmviana.sigae.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	private UsuarioService userService;
	
	@GetMapping("/{id}")
	public Optional<Usuario> indexById(@PathVariable Long id) {
		return userService.findOne(id);
	}
	
}

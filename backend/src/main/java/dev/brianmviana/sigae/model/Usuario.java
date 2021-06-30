package dev.brianmviana.sigae.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuario {

	@Id
	@NotBlank
	private String username;

	@NotBlank
	private String senha;

	// TODO refatorar para classe Pessoa
	@NotBlank
	private String nome;

	@Value("true")
	private Boolean status;
}

package dev.brianmviana.sigae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotBlank
	private String name;

	@NotBlank
	private String login;

	@NotBlank
	private String password;
}

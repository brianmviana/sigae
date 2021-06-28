package dev.brianmviana.sigae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import dev.brianmviana.sigae.model.enums.UserType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name="user")
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

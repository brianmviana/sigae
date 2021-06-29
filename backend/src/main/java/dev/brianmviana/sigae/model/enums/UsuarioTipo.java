package dev.brianmviana.sigae.model.enums;

public enum UsuarioTipo {
	STUDENT("student"),
	TEACHER("teacher"),
	ADMIN("admin");
	
	private String description;
	
	UsuarioTipo(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	
}

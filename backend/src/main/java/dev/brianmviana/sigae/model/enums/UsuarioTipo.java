package dev.brianmviana.sigae.model.enums;

public enum UsuarioTipo {
	ALUNO("aluno"),
	PROFESSOR("professor"),
	ADMIN("admin");
	
	private String description;
	
	UsuarioTipo(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}	
}

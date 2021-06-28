package dev.brianmviana.sigae.model.enums;

public enum UserType {
	STUDENT("student"),
	TEACHER("teacher"),
	ADMIN("admin");
	
	private String description;
	
	UserType(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	
}

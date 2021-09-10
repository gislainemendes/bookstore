package br.com.alura.bookstore.modelo;

import java.time.LocalDate;

public class Autores {

	private String name;
	private String email;
	private LocalDate birthDate;
	private String miniCurriculo;

	@Override
	public String toString() {
		return "Autores [name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", miniCurriculo="
				+ miniCurriculo + "]";
	}

	
	
	public Autores(String name, String email, LocalDate birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}


	public Autores() {
	}

	public Autores(String name, String email, LocalDate birthDate, String miniCurriculo) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.miniCurriculo = miniCurriculo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getMiniCurriculo() {
		return miniCurriculo;
	}

	public void setMiniCurriculo(String miniCurriculo) {
		this.miniCurriculo = miniCurriculo;
	}

}

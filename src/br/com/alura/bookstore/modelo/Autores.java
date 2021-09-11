package br.com.alura.bookstore.modelo;

import java.time.LocalDate;

public class Autores {

	private String name;
	private String email;
	private LocalDate birthDate;
	private String curriculo;

	@Override
	public String toString() {
		return "Autores [name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", miniCurriculo="
				+ curriculo + "]";
	}


	public Autores() {
	}

	public Autores(String name, String email, LocalDate birthDate, String curriculo) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.curriculo = curriculo;
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


	public String getCurriculo() {
		return curriculo;
	}


	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}


}

package br.com.alura.bookstore.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.bookstore.modelo.Autores;

public class Teste {

	public static void main(String[] args) {
		Autores a = new Autores();
		a.setName("Jorge Mateus");
		a.setBirthDate(LocalDate.of(1980, 3, 21));
		a.setEmail("jorge@gmail.com");
		a.setMiniCurriculo("Eu sou um autor de livros");
		
		System.out.println(a.getName());
		System.out.println(a.getBirthDate().format(DateTimeFormatter
				.ofPattern("dd/MM/yyyy")));
		System.out.println(a.getEmail());
		System.out.println(a.getMiniCurriculo());
		
		Autores a2 = new Autores(
				"Nelson Martins",
				"nelson@gmail.com",
				LocalDate.of(1960, 4, 14),
				"Eu sou o melhor autor de livros");
		
		System.out.println(a2);

	}

}

package br.com.alura.bookstore.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.bookstore.modelo.Autores;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/autores")
public class AutoresServlet extends HttpServlet {

	private List<Autores> autores = new ArrayList<>();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Autores a1 = new Autores(
				"Nelson Martins",
				"nelson@gmail.com",
				LocalDate.of(1960, 4, 14),
				"Eu sou o melhor autor de livros");
		
		Autores a2 = new Autores(
				"Rosa Maria",
				"rosa@gmail.com",
				LocalDate.of(1970, 12, 25),
				"Eu sou o melhor autora de livros");
		
		autores.add(a1);
		autores.add(a2);
		
		req.
		setAttribute("autores", autores);
		
		req
		.getRequestDispatcher("WEB-INF/jsp/autores.jsp")
		.forward(req, resp);
	}
}

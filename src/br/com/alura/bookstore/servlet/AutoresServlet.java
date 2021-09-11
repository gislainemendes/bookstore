package br.com.alura.bookstore.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.
		setAttribute("autores", autores);
		
		req
		.getRequestDispatcher("WEB-INF/jsp/autores.jsp")
		.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		LocalDate data = LocalDate.parse(req.getParameter("dataNascimento"), 
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String curriculo = req.getParameter("curriculo");
		
		Autores a1 = new Autores(
				nome,
				email,
				data, curriculo);
		
		autores.add(a1);

		resp.sendRedirect("autores");
	}
	
}

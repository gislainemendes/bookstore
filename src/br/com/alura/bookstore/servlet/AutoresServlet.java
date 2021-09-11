package br.com.alura.bookstore.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.bookstore.dao.AutoresDAO;
import br.com.alura.bookstore.factory.ConnectionFactory;
import br.com.alura.bookstore.modelo.Autores;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/autores")
public class AutoresServlet extends HttpServlet {
	
	private AutoresDAO dao;

	public AutoresServlet() {
		Connection conexao = new ConnectionFactory().getConnection();
		this.dao = new AutoresDAO(conexao);
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.
		setAttribute("autores", dao.listar());
		
		req
		.getRequestDispatcher("WEB-INF/jsp/autores.jsp")
		.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("name");
		String email = req.getParameter("email");
		LocalDate data = LocalDate.parse(req.getParameter("birthDate"), 
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String curriculo = req.getParameter("curriculo");
		
		Autores novo = new Autores(nome, email, data, curriculo);
		dao.salvar(novo);

		resp.sendRedirect("autores");
	}
	
}

package br.com.alura.bookstore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.bookstore.modelo.Autores;

public class AutoresDAO {
	
	private Connection conexao;

	public AutoresDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void salvar(Autores autores) {
		try {
			String sql = "insert into autores(name, email, birthDate, curriculo) values(?,?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
		
			
			ps.setString(1, autores.getName());
			ps.setString(2, autores.getEmail());
			ps.setDate(3, Date.valueOf(autores.getBirthDate()));
			ps.setString(4, autores.getCurriculo());
			
			ps.execute();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Autores> listar() {
		try {
			String sql = "select * from autores";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<Autores> autores = new ArrayList<>();
			
			while (rs.next()) {
				Autores autor = new Autores(
						rs.getString("name"), 
						rs.getString("email"),
						rs.getDate("birthDate").toLocalDate(),
						rs.getString("curriculo"));
				autores.add(autor);
			}
			
			return autores;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}

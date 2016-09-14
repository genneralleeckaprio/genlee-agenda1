package com.genlee.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.genlee.jdbc.ConnectionFactory;
import com.genlee.model.Contacto;

public class ContactoDao {

	private Connection connection;

	public ContactoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contacto contacto) {
		String sql = "insert into agenda " +
					"(nome,email,endereco,dataNascimento,telefone)" +
					" values (?,?,?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contacto.getNome());
			stmt.setString(2, contacto.getEmail());
			stmt.setString(3, contacto.getEndereco());
			stmt.setDate(4, new Date(contacto.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contacto.getTelefone());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}

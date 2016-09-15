package com.genlee.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.genlee.jdbc.ConnectionFactory;
import com.genlee.model.Contacto;

public class ContactoDao {

	private Connection connection;

	public ContactoDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Contacto contacto) {
		String sql = "insert into agenda " + "(nome,email,endereco,dataNascimento,telefone)" + " values (?,?,?,?,?)";

		try {
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
	
	public List<Contacto> getLista() {
		try{
			List<Contacto> contactos = new ArrayList<Contacto>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from agenda");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Contacto contacto = new Contacto();
				contacto.setId(rs.getLong("id"));
				contacto.setNome(rs.getString("nome"));
				contacto.setEmail(rs.getString("email"));
				contacto.setEndereco(rs.getString("endereco"));
				contacto.setTelefone(rs.getLong("telefone"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contacto.setDataNascimento(data);
				
				contactos.add(contacto);
				
			}
			rs.close();
			stmt.close();
			connection.close();
			
			return contactos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void actualiza(Contacto contacto) {
		String sql = "update agenda set nome=?, email=?, endereco=?," +
					"dataNascimento=?, telefone=? where id=?";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contacto.getNome());
			stmt.setString(2, contacto.getEmail());
			stmt.setString(3, contacto.getEndereco());
			stmt.setDate(4, new Date(contacto.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contacto.getTelefone());
			stmt.setLong(6, contacto.getId());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove (Contacto contacto) {
		try{
			PreparedStatement stmt = connection.prepareStatement("delete " + 
					"from agenda where id=?");
			stmt.setLong(1, contacto.getId());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}

}

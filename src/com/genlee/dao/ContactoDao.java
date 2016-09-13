package com.genlee.dao;

import java.sql.Connection;

import com.genlee.jdbc.ConnectionFactory;

public class ContactoDao {

	private Connection connection;

	public ContactoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	
	
}

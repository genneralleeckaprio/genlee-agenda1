package com.genlee.dao;

import java.util.List;

import com.genlee.model.Contacto;

public class TestaLista {
	
	public static void main(String[] args) {
		
		ContactoDao dao = new ContactoDao();
		
		List<Contacto> contactos = dao.getLista();
		
		for (Contacto contacto : contactos) {
			System.out.println("Nome: " + contacto.getNome());
			System.out.println("Email: " + contacto.getEmail());
			System.out.println("Endereco: " + contacto.getEndereco());
			System.out.println("Data de Nascimento: " + contacto.getDataNascimento().getTime());
			System.out.println("Telefone: " + contacto.getTelefone() + "\n");
		}
		
	}

}

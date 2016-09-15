package com.genlee.dao;

import com.genlee.model.Contacto;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		
		contacto.setId(2L);
		
		ContactoDao dao = new ContactoDao();
		
		String nome = contacto.getNome();
		
		dao.remove(contacto);
		
		System.out.println("Contacto  " + nome + " eliminado");
	}

}

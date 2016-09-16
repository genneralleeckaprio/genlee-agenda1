package com.genlee.dao;

import com.genlee.model.Contacto;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		
		contacto.setId(5L);
		
		ContactoDao dao = new ContactoDao();
		
		
		dao.remove(contacto);
		
		System.out.println("Contacto eliminado");
	}

}

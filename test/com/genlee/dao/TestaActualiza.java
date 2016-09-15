package com.genlee.dao;

import java.util.Calendar;

import com.genlee.model.Contacto;

public class TestaActualiza {
	
public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		contacto.setNome("GenLee");
		contacto.setEmail("cinderellaman@live.com.pt");
		contacto.setEndereco("Street B, C Double O P");
		contacto.setDataNascimento(Calendar.getInstance());
		contacto.setTelefone(824865240);
		contacto.setId(1L);
		
		ContactoDao dao = new ContactoDao();
		
		dao.actualiza(contacto);
		
		System.out.println("Actualizado "+contacto.getNome());
	}

}

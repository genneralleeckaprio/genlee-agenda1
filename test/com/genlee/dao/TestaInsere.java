package com.genlee.dao;

import java.util.Calendar;

import com.genlee.model.Contacto;

public class TestaInsere {
	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		contacto.setNome("Celso");
		contacto.setEmail("cinderellaman@live.com.pt");
		contacto.setEndereco("Street B, C Double O P");
		contacto.setDataNascimento(Calendar.getInstance());
		contacto.setTelefone(824865240);
		
		ContactoDao dao = new ContactoDao();
		
		dao.adiciona(contacto);
		
		System.out.println("Gravado "+contacto.getNome());
	}

}

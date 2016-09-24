/**
 * @author genneral
 */
package com.genlee.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.genlee.dao.ContactoDao;
import com.genlee.model.Contacto;

@WebServlet("/adicionaContacto")
public class AdicionaContactoServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		
		String nome = req.getParameter("nome");
		String endereco = req.getParameter("endereco");
		String email = req.getParameter("email");
		String dataEmTexto = req.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		Long telefone = Long.parseLong(req.getParameter("telefone"));

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversao da data");
			return;
		}

		Contacto contacto = new Contacto();
		contacto.setNome(nome);
		contacto.setEndereco(endereco);
		contacto.setEmail(email);
		contacto.setDataNascimento(dataNascimento);
		contacto.setTelefone(telefone);

		ContactoDao dao = new ContactoDao();
		dao.adiciona(contacto);

		RequestDispatcher rd = req.getRequestDispatcher("/contacto-adicionado.jsp");
		rd.forward(req, res);
	}

}

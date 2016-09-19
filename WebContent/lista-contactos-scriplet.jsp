<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*,
		com.genlee.dao.*,
		com.genlee.model.*"%>
		
<html>

<table border = 1 style="width: 50%">

	<thead>
	<tr>
	<th>Nome</th>
	<th>Email</th>
	<th>Endereco</th>
	<th>DataNascimento</th>
	<th>Telefone</th>
	</tr>
	</thead>
	
	<tbody>
		
		<%
		ContactoDao dao = new ContactoDao();
		List<Contacto> contactos = dao.getLista();
	
		SimpleDateFormat sfd = new SimpleDateFormat ("dd/MM/yyyy");
		
		for (Contacto contacto : contactos) {
		
		%>
		
			<tr>
				<td><%=contacto.getNome() %></td>
				<td><%=contacto.getEmail() %></td>
				<td><%=contacto.getEndereco() %></td>
				<td><%=sfd.format(contacto.getDataNascimento().getTime()) %></td>
				<td><%=contacto.getTelefone() %></td>
			</tr>
		<%
		}
		%>
		
	</tbody>
	</table>

</html>		
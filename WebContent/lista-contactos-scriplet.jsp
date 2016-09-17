<%@ page import="java.util.*,
		com.genlee.dao.*,
		com.genlee.model.*"%>
		
<html>
	<body>
		<table>
		<%
		ContactoDao dao = new ContactoDao();
		List<Contacto> contactos = dao.getLista();
		for (Contacto contacto : contactos) {
		
		%>
		
			<tr>
				<td><%=contacto.getNome() %></td>
				<td><%=contacto.getEmail() %></td>
				<td><%=contacto.getEndereco() %></td>
				<td><%=contacto.getDataNascimento().getTime() %></td>
				<td><%=contacto.getTelefone() %></td>
			</tr>
		<%
		}
		%>
		</table>
	</body>

</html>		
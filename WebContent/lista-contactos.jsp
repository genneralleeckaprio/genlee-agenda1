<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html>

<table border=1 style="width: 50%">

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
		
		<c:import url="cabecalho.jsp"/>

		<!-- Cria DAO -->
		<jsp:useBean id="dao" class="com.genlee.dao.ContactoDao" />

		<!-- -Percorre contactos montando as linhas da tabela -->
		<c:forEach var="contacto" items="${dao.lista}"  >
			<tr>
				<td>${contacto.nome}</td>
				<td>
				<c:choose>
				<c:when test="${not empty contacto.email}">
					<a href="mailto:${contacto.email}">${contacto.email}</a>
				</c:when>
				
				<c:otherwise>
						E-mail nao informado
				</c:otherwise>
				</c:choose>
				</td>
				<td>${contacto.endereco}</td>
				<td>
				<fmt:formatDate value="${contacto.dataNascimento.time}"
					pattern="dd/MM/yyyy"/>
				</td>
				<td>${contacto.telefone}</td>
			</tr>
		</c:forEach>		
					
	</tbody>
</table>

<c:import url="rodape.jsp"/>

</html>

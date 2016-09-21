<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="cmp" %>

<html>
<head>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<meta charset="ISO-8859-1">
<title>GenLee</title>
</head>
<body>
<c:import url="cabecalho.jsp"/>
	<h1>Adiciona Contactos</h1>
	<hr />
	<form action="adicionaContacto" method="post">
		
		<label for="nomeContacto">Nome</label> 
		<input type="text" id="nomeContacto" name="nome" /><br /> 
		<label for="emailContacto">E-mail: </label>
		<input type="text" id="emailContacto" name="email" /><br /> 
		<label for="enderecoContacto">Endereco: </label>
		<input type="text" id="enderecoContacto" name="endereco" /><br /> 
		<label for="dataNascimentoContacto">Data Nascimento: </label>
		<cmp:campoData id="dataNascimentoContacto"/><br />
		<label for="telefoneContacto">Telefone: </label>
	    <input type="text" id="telefoneContacto" name="telefone" /><br />
		
		<input type="submit" value="GenSave" />
	</form>
	<c:import url="rodape.jsp"/>
</body>
</html>
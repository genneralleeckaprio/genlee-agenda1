

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GenLee</title>
</head>
<body>
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
		<input type="text" id="dataNascimentoContacto" name="dataNascimento" /><br />
		<label for="telefoneContacto">Telefone: </label>
	    <input type="text" id="telefoneContacto" name="telefone" /><br />
		
		<input type="submit" value="GenSave" />
	</form>
</body>
</html>
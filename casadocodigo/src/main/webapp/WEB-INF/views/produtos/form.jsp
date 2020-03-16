<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livraria Mariana</title>
</head>
<body>

	<form:form action="/casadocodigo/produtos" method="post"
		commandName="produto" enctype="multipart/form-data">
		<div>
			<label>Titulo</label>
			<form:input path="titulo" />
			<form:errors path="titulo" />
		</div>

		<div>
			<label>Descri��o</label>
			<form:textarea rows="10" cols="20" path="descricao" />
			<form:errors path="descricao" />
		</div>

		<div>
			<label>P�ginas</label>
			<form:input path="paginas" />
			<form:errors path="paginas" />
		</div>
		
		<div>
			<label>Data de Lan�amento</label>
			<form:input path="dataLancamento" />
			<form:errors path="dataLancamento" />
		</div>

		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label> <input type="text"
					name="precos[${status.index}].valor" /> <input type="hidden"
					name="precos[${status.index}].tipo" value="${tipoPreco}" />
			</div>
		</c:forEach>
		
		<div>
        	<label>Sum�rio</label>
        	<input name="sumario" type="file" />
    	</div>

		<button type="submit">Cadastrar</button>
	</form:form>


</body>
</html>
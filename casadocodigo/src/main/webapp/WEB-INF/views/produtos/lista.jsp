<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livraria Casa do C�digo</title>
</head>
<body>
<h1>Lista de Produtos</h1>
    <div>${sucesso}</div>
    <div>${falha}</div>
	<table>
		<tr>
			<td>T�tulo</td>
			<td>Descri��o</td>
			<td>P�ginas</td>
		</tr>
		
		<c:forEach items="${produtos}" var="produto">
			<tr>
				<td>${produto.titulo}</td>
				<td>${produto.descricao}</td>
				<td>${produto.paginas}</td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>
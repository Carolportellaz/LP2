<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Palavras cadastrads</title>
</head>
<body>
	<h2>Palavras cadastradas: </h2>
	<table style="border:1px solid black">
		<tr>
			<th>LISTA DE PALAVRAS</th>
		</tr>
	
			<c:forEach items="${palavras}" var="palavra">
				<tr>
					<td>${palavra}</td>
				</tr>
			</c:forEach>
	</table>
	
	<br>
	<br>
	
	<a href="Cadastro.html">Voltar</a>
	
</body>
</html>
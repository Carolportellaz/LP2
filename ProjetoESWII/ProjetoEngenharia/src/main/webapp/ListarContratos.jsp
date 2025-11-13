<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar contratos</title>
</head>
<body>
	<c:forEach items="${ contratos }" var="contrato">
		<li>Data: ${contrato.data}</li>
		<li>Valor: ${contrato.valor}</li>
		<li>Parcela: ${contrato.parcela}</li>
		
	</c:forEach>
</body>
</html>
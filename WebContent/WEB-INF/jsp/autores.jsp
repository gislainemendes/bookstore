<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Autores</title>
</head>
<body>
	<h1>Lista de Autores</h1>
	<table>
		<thead>
			<tr>
				<th>NOME</th>
				<th>EMAIL</th>
				<th>DATA DE NASCIMENTO</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${autores}" var="a">
			<tr>
				<td>${a.name}</td>
				<td>${a.email}</td>
				<td>${a.birthDate}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
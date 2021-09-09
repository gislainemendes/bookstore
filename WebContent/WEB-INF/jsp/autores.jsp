<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autores</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">Lista de Autores</h1>
	<table class="table table-hover table-striped table-bordered">
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
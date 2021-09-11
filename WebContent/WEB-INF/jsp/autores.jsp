<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autores</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<form action="<c:url value="/autores"/>" method="POST">
		<div class="form-group">
			<label for="name">Nome</label>
			<input id="name" class="form-control" name="name">
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" class="form-control" name="email">
		</div>
		<div class="form-group">
			<label for="birthDate">Data de nascimento</label>
			<input id="birthDate" class="form-control" name="birthDate">
		</div>
		<div class="form-group">
			<label for="curriculo">Mini Curriculo</label>
			<input id="curriculo" class="form-control" name="curriculo">
		</div>
		
		<input type="submit" value="Gravar" class="mt-2 btn-primary">
	</form>
	
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
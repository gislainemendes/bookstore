<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autores</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
	<link href="./resource/css/estilos.css" rel="stylesheet">
</head>
<body class="container-fluid my-4 p-4 corfundo">
	<form action="<c:url value="/autores"/>" method="POST">
	<div class="row justify-content-center">
	<div class="col-10">
		<div class="form-group">
			<label class="py-1 fontmodifier" for="name">Nome</label>
			<input id="name" class="form-control mb-4  bg-light" name="name"  placeholder="Joãozinho da Silva">
		</div>
		<div class="form-group">
			<label class="py-1 fontmodifier" for="email">Email</label>
			<input id="email" class="form-control mb-4 bg-light" name="email" placeholder="joao@gmail.com">
		</div>
		<div class="form-group">
			<label class="py-1 fontmodifier" for="birthDate">Data de nascimento</label>
			<input id="birthDate" class="form-control mb-4 bg-light" name="birthDate" placeholder="01/01/1901">
		</div>
		<div class="form-group">
			<label class="py-1 fontmodifier" for="curriculo">Mini Curriculo</label>
			<input id="curriculo" class="form-control mb-4 bg-light" name="curriculo" placeholder="Isto é o mini currículo de João">
		</div>
		<div class="d-grid gap-2 col-12 mx-auto">
		  <button class="mb-5 p-2 btn btn-secondary btn-block" type="submit" value="Gravar" >GRAVAR</button>
		  </div>
		
	</form>
	
	<h1 class="text-center text-light">Lista de Autores</h1>
	<table class="table table-hover table-striped table-bordered corfundo2">
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
	</div>
	
	  </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Liste des Clients</title>
</head>
<body>
<img src="logoProxiBanque.png">

	<h1>Affichage de la liste des clients</h1>

	<table>
		<tr>
			<th>ID ----</th>
			<th>Prénom----</th>
			<th>Nom-------</th>
			<th>E-mail-----------------------------</th>
			<th>ID conseiller</th>
			<th>Prénom----</th>
			<th>Nom--------</th>
			<th>Afficher---</th>
			<c:forEach items="${customers}" var="cus">
				<tr>
					<td>${cus.id}</td>
					<!-- Vérifier nom de l'attribut -->
					<td>${cus.firstname}</td>
					<td>${cus.lastname}</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="showcustomer?id=${cus.id}">Afficher</a></td>
			</c:forEach>
		</tr>
	</table>
<br>

	<form action="returnauthentification">
		<input type="submit" value="Retour à l'identification">
	</form>



</body>
</html>
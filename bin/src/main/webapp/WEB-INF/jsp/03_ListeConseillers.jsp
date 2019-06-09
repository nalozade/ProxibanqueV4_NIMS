<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des conseillers</title>
</head>
<body>
<img src="logoProxiBanque.png">


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
			<c:forEach items="${advisors}" var="adv">
				<tr>
					<td>${adv.idAdvisor}</td>
					<!-- Vérifier nom de l'attribut -->
					<td>${adv.firstname}</td>
					<td>${adv.lastname}</td>
					<td></td>
					<td><a href="afficherclient?idClient=${adv.idAdvisor}">Voir</a></td>
			</c:forEach>
		</tr>
	</table>
<br>

	<form action="returnauthentification">
		<input type="submit" value="Retour à l'identification">
	</form>




</body>
</html>
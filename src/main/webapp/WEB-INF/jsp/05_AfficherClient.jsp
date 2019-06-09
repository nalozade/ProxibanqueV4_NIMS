<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher le client</title>
</head>
<body>
	<img src="logoProxiBanque.png">
	<br>Id Client : ${cus.id }
	<br>Prénom : ${cus.firstname }
	<br>Nom : ${cus.lastname }


</body>
</html>
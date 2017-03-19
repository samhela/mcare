<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="css/StyleSheet.css">
<style type="text/css">@import url(css/StyleSheet.css);</style>
<title>Side menu</title>
</head>
<body>
	
	<div class="SideMenuPanel">
	
	
	
 <a href="Insur"><spring:message code="add.insurance"/></a><br>	
	<a href="ShowClientForm"><spring:message code="add.client"/></a><br>
	<a href="#"><spring:message code="add.hospital"/></a><br>
	<a href="#"><spring:message code="insurance.details"/></a><br>
	<a href="#"><spring:message code="client.info"/></a><br>
	
	<br/>
	

	</div>
</body>
</html>

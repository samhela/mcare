<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="css/StyleSheet.css">
<!-- <style type="text/css">@import url(css/StyleSheet.css);</style> -->
<title>Login page</title>
</head>
<body>
	
	<div class="InputPanel ">
			<%-- <div class="PageTitle">
			Welcome: <em>${user.userName}</em>	
			--%>
		 <div class="PageTitle"> 
		 
		 <div class="imagePanel"><img src="/resources/images/logo.PNG"></div>
		 
		<div class="imagePanel"><img src="/resources/images/insurance.png">	</div>
		
		</div> 		
			
			
		
	
			
	</div>
	<div class="InputPanel">
	<a href="home">Home</a>&nbsp;|&nbsp;<a href="?lang=en">English</a>&nbsp;|&nbsp;<a href="?lang=am">Amharic</a>
	</div>
</body>
</html>

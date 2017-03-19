<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">@import url(css/StyleSheet.css);</style>
<!-- <script type="text/javascript">@import url(javaScript/script.js);</script> -->
<script src="javaScript/jquery-3.1.1.min.js"></script>
<title>Health Care System</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	
	 
	 <jsp:include page="sidemenu.jsp"></jsp:include>
	
	<div class="ContentPanel">
	<p>
	 Welcome: <em>${user.userName}</em>	<br>
	 <h3>You can use the left side navigation links to do your task. </h3>
	
	</p>
	

	</div>
	
	
	
	
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>

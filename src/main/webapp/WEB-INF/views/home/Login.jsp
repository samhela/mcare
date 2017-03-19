<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="css/StyleSheet.css">
<style type="text/css">@import url(css/StyleSheet.css);</style>
<title>Login page</title>
</head>
<body>
	
	<div id="InputPanel">
		<form  method="post" action="login">
			<fieldset>
				<legend>User Login</legend>
       <p>
       <table><tr>
			<td><label for="UserName">User Name</label></td>
			<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
			<td> <label for="Password">Password</label></td>
			<td><input type="text" name="password"/></td>
			</tr>
	</table>
			<input type="submit" value="Submit"/>
			
			<br>
			<div id="error">
	
	<c:choose>        
			         <c:when test="${not empty message}">
			                 <h3 style="color:red;">${message}</h3>
			       </c:when>
			       
			<c:otherwise>
			         <h4> Enter valid Username and Password.</h4>
			</c:otherwise>
			
	</c:choose>
			
	</div>
			
				
	   </p>
			</fieldset>
		</form>
	</div>
</body>
</html>

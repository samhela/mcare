<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Registration form</title>
<link href="<c:url value="/resources/css/StyleSheet.css" />" rel="stylesheet">
</head>
<body>
<jsp:include page="../layout/header.jsp"/>


<jsp:include page="../layout/sidemenu.jsp"/>

<div class="ContentPanel">
<h3>Add User Information</h3><hr/>
<form:form modelAttribute="newUser" action="ShowUserForm" method="post">
<fieldset>
<legend>Add new user</legend>
<table>
<tr>
<td>UserName:</td>
<td> <form:input path="userName"/>   </td>
</tr>


<tr>
<td>Password:</td>
<td> <form:input path="password"/>   </td>
</tr>

<tr>
<td>Insurance Details</td>
</tr>
<%-- <tr>
<td>Insurance Name:</td> <td> <form:input path="insurance.insuranceName"/>   </td>
</tr> --%>
<%-- <tr>
<td>Hospital Location:</td> <td> <form:input path="insurance.hospital.location"/>   </td>
</tr> --%>
<tr>
<%-- <td></td> <td> <form:input path="insurance.insuranceName"/>   </td> --%>

</tr>

<tr><td>
<input type="submit" value="submit"/>

</td></tr>
</table>







</fieldset>








</form:form>


</div>





<jsp:include page="../layout/footer.jsp"/>
</body>
</html>

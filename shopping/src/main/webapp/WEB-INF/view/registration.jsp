<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
body
   {
      background-image:url(resources/images/bgg1.jpg);
      background-size:cover;
      background-repeat:no-repeat;
   }
 h2
   {
     text-align:center;
   }  
   
 table
   {
     width:40%;
     margin:50px;
   }
   
   #footer-row1{
    margin-top: 80px;
    padding: 20px;
    background-image:bg1.jpg;
    bottom: 0;
    align:center;
}

.copyright{
    text-align: center;
    color: Black;
    font-size:13px;
} 
 
   </style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<h2> ENROLL USER </h2>
<u>
<h4 style="text-align:right"><a href="index">Back to home</a></h4>
</u>
<br>
	<div align="center">
	<form:form method="POST" action="saveUser">
		<table>
		    <tr>
			        <td><form:label path="username" cssStyle="padding:10px">UserName &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
			        <td><form:input path="username" cssStyle="width:60%" value="${user.username}" /></td>
			        <td><form:errors path="username" cssStyle="color: #ff0000;"/></td>
			    </tr>
			<tr>
				<td><form:label path="password" cssStyle="padding:10px">Password &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:password path="password" cssStyle="width:60%" value="${user.password}" /></td>
				<td><form:errors path="password" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td><form:label path="name" cssStyle="padding:10px">Name &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="name" cssStyle="width:60%" value="${user.name}" /></td>
				 <td><form:errors path="name" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td><form:label path="email" cssStyle="padding:10px">Email &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="email" cssStyle="width:60%" value="${user.email}" /></td>
				<td><form:errors path="email" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td><form:label path="phn" cssStyle="padding:10px">Phone &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="phn" cssStyle="width:60%" value="${user.phn}" /></td>
				<td><form:errors path="phn" cssStyle="color: #ff0000;"/></td>
			</tr>
	
		</table>
		<br><br>
		<input type="submit" value="Submit" />
		<input name="reset" type="reset" />
	</form:form>
	</div>

		<%@include file="footer.jsp" %>
</body>
</html>
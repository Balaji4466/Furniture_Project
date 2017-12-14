<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<style>
body 
{
	background-image: url(resources/images/bg1.jpg);
}
h2
{
	text-align:center;
}
.div2 {
    width: 1000px;
    height: 450px;    
    padding: 50px;
    margin-top:80px;
    margin-left:180px;
    border: 3px solid black;
}
.div3{
 		padding:10px;
 		margin-top:50px;
}

</style>
<title>LOGIN PAGE</title>
</head>
<body>
<h2>User Login</h2>
<u>
<h4 style="text-align:right"><a href="index">Back to home</a></h4>
</u>

<div class="div2">
<center>
<div class="div3"> 
        <form name='f' action="<c:url value='j_spring_security_check' />"  method='POST'>
 
  <table>
   <tr>
    <td Style="padding:10px"><b>User :</b></td>
    <td><input type='text' name='j_username' value=''>
    </td>
   </tr>
   <tr>
    <td Style="padding:10px"><b>Password :</b></td>
    <td><input type='password' name='j_password' />
    </td>
   </tr>
   <tr>
    <td colspan='2'>
    </td>
    <td colspan='2'>
    </td>
   </tr>
  </table>
  <br>
  <br>
 <input name="submit" type="submit" value="submit" />
 <input name="reset" type="reset" />
 </form>
    <br>
    <a href="signup"><u>New User? Click Here</u></a>
	</div>
	</center>
</div>
</body>
<br><br><br>
<div align="center">
<%@include file="footer.jsp" %>
</div>
</html>
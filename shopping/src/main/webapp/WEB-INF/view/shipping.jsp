<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Shipping Details</title>
<style>
body
   {
      background-image:url(resources/images/bg1.jpg);
   }
   
  h2
   {
 		text-align:center;  
   }
 td,tr
   {
     margin:20px;
     padding:20;
   }  
   
 table
   {
     align:center;
     width:40%;
     margin:100px;
     padding:40;
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

<h2> SHIPPING DETAILS </h2>
<u>
<h4 style="text-align:right"><a href=cart>Back to Cart</a></h4>
</u>
<br>
<div align="center">
<center>
<table>

<tr>
<td><label>NAME &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</label></td>
<td>${userlist.name}</td>
</tr>

<tr>
<td><label>Email &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</label></td>
<td>${userlist.email}</td>
</tr>

<tr>
<td><label>Phone No &nbsp&nbsp:</label></td>
<td>${userlist.phn}</td>
</tr>

<tr>
<td><label>Total Amount &nbsp&nbsp:</label></td>
<td>${totalprice}</td>
</tr>

<tr>
<td><label>Address &nbsp&nbsp&nbsp&nbsp&nbsp:</label></td>
<td><textarea rows="4" cols="50"></textarea></td>
</tr>
</table>
</center>
<h3><a href="shipping" class="btn btn-info btn-lg">Proceed To Payment</a></h3>
</div>


<%@include file="footer.jsp" %>
</body>
</html>
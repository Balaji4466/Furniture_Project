<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<style>
body
   {
      background-image:url(resources/images/bg1.jpg);
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>SUPPLIER CRUD PAGE</title>
</head>
<body>
<div class="row">

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Furniture Shopping</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="homeadmin">Home </a></li>
					<li class="active"><a href="addSupplier">Add Supplier</a></li>
					<li><a href="addCategory">Category</a></li>
					<li><a href="product">Product</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
				<li><a href="">
						<span class="glyphicon glyphicon-user">
							<b style="color:blue">${admin}</b></a>
						</span>
					</li> 
					<li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>
							Logout</a></li>
							</ul>
				</ul>
			</div>

		</nav>
	</div>

	<h2> ADD SUPPLIER </h2>	
	<br>
	<div align="center">
     <form:form method="POST" action="saveSupplier">
		<table>
			<tr>
				<td><form:label path="id" cssStyle="padding:10px">Supplier Id &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="id" cssStyle="width:60%" value="${supplier.id}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="name" cssStyle="padding:10px">Supplier Name &nbsp&nbsp&nbsp&nbsp&nbsp:</form:label></td>
				<td><form:input path="name" cssStyle="width:60%" value="${supplier.name}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="address" cssStyle="padding:10px">Supplier Address :</form:label></td>
				<td><form:input path="address" cssStyle="width:60%" value="${supplier.address}" /></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="Submit" />
		<input name="reset" type="reset" />
	</form:form>
	</div>
<div align="center">	
	 <c:if test="${!empty suppliers}">
 <table align="center" border="1">
  <tr>
   <th>Supplier ID</th>
   <th>Supplier Name</th>
   <th>Address</th>
   <th>EDIT/DELETE</th>
  </tr>
  <c:forEach items="${suppliers}" var="supplier">
   <tr>
    <td><c:out value="${supplier.id}"/></td>
    <td><c:out value="${supplier.name}"/></td>
    <td><c:out value="${supplier.address}"/></td>
    <td align="center"><a href="editSupplier?supplierId=${supplier.id}">Edit</a> | <a href="deleteSupplier?supplierId=${supplier.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
</div>
	<div id="footer-row1">
	     <h4 class="copyright"> &copy This Page Owner is BalaG</h4>
	 </div>
 </body>
</html>


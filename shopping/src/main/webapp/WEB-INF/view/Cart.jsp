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
<style>
body {
	background-image: url(resources/images/bg1.jpg);
}

h2 {
	text-align: center;
}

table {
	width: 70%;
	margin: 50px;
	padding:50px;
}

th{
		height:70px;
		text-align:center;
	}

tr,td
	{
		text-align:center;
	}

#footer-row1 {
	margin-top: 80px;
	padding: 20px;
	background-image: bg1.jpg;
	bottom: 0;
	align: center;
}

h5
	{
		text-align:right;
	}

.copyright {
	text-align: center;
	color: Black;
	font-size: 13px;
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
<title>CART</title>
</head>

<body>



	<div class="row">

		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Furniture Shopping</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="homeuser">Home </a></li>
				<li><a href="viewproduct">Bedroom </a></li>
				<li><a href="kitchen">Kitchen</a></li>
				<li><a href="bar">Bar </a></li>
				<li><a href="hall">Hall </a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href=""> <span class="glyphicon glyphicon-user">
							<b style="color: blue">${user}</b></a> </span></li>
				<li class="active"><a href="cart"> <span
						class="glyphicon glyphicon-shopping-cart"></span> Cart
				</a></li>
				<li><a href="logout"> <span
						class="glyphicon glyphicon-log-out"></span> Logout
				</a></li>
			</ul>
		</div>
		</nav>
	</div>


<h2>User Cart</h2><h5><button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Empty Cart</button></h5> 

<div align="center">	
	 <c:if test="${!empty cartitemlist}">
 <table align="center" border="1">
  <tr>
  <th>Name</th>
  <th>Price</th>
   <th>Quantity</th>
   <th>Total Price</th>
   <th>Image</th>
   <th>Delete Item</th>
   <th>Edit Quantity</th>
  </tr>
  <c:forEach items="${cartitemlist}" var="cart">
   <tr>
    <td><c:out value="${cart.name}"/></td>
    <td><c:out value="${cart.price}"/></td>
    <td><c:out value="${cart.quantity}"/></td>
    <td><c:out value="${cart.totalprice}"/></td>
    <td><img src="resources/${cart.product.getPid()}.jpg" height="100" width="100" /></td>
    <td><center><a href="deletecartitem?cartitemid=${cart.ciid}" class="btn btn-info btn-lg" style="font-size:12px"><span class="glyphicon glyphicon-trash"></span></center></td>
    <td><center><a href="addquantity?cartitemid=${cart.ciid}">
          <span class="glyphicon glyphicon-plus" style="font-size:12px"></span>
        </a>/<a href="editquantity?cartitemid=${cart.ciid}">
          <span class="glyphicon glyphicon-minus" style="font-size:12px"></span>
        </a></center></td>   
   </tr>
  </c:forEach>
 </table>
</c:if>
</div>

<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
      <!-- Modal Header-->
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
          <h4 class="modal-title">Alert</h4>
          </div>
          <div class="modal-body">
          <p>Do You want to delete All Items??</p>
        </div>
        
         <div class="modal-footer">
          <a href="emptycart" class="btn btn-info btn-lg"  style="font-size:12px">Yes</a>
        </div>
          </div>
          </div>
          </div>

<h5><a href="shipping" class="btn btn-info btn-lg">Shipping Detail</a></h5>


</body>

<%@include file="footer.jsp"%>>
</html>


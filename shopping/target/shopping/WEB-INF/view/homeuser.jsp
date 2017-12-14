<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>HomeUser</title>

<style>
body
   {
      background-image:url(resources/images/bg1.jpg);
   }
    #footer-row1{
    margin-top: 80px;
    padding: 20px;
    background-image:bg1.jpg;
    bottom: 0;
    align:center;
    font-family: sans-serif;
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
	<!-- menu bar -->
	<div class="row">

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Furniture Shopping</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="homeuser">Home </a></li>
					<li><a href="#c1">About us</a></li>
					<li><a href="viewproduct">View Product</a></li>
				</ul>
        		<ul class="nav navbar-nav navbar-right">
        			<li><a href="">
						<span class="glyphicon glyphicon-user">
							<b style="color:blue">${user}</b></a>
						</span>
					</li> 
					<li>
						<a href="cart">
							 <span class="glyphicon glyphicon-shopping-cart"></span> Cart
						</a>
					</li>				
					<li>
						<a href="logout">
							<span class="glyphicon glyphicon-log-out"></span>
							Logout
						</a>
					</li>
				</ul>
			</div>

		</nav>
	</div>

	<!--carosul  -->
	<div class="row">

		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="resources/images/image1.jpg" alt="Los Angeles"
						style="width: 100%;">
				</div>

				<div class="item">
					<img src="resources/images/image2.jpg" alt="Chicago"
						style="width: 100%;">
				</div>

				<div class="item">
					<img src="resources/images/imgg1.jpg" alt="New york"
						style="width: 100%;">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div id="c1">
	<h4>Exclusive Range of Furniture Online :</h4>

<p>epperfry.com is the best place to buy metal as well as wooden furniture online in India. Here at Pepperfry, we are committed to offering our customers the widest range in home furniture like tables, sofas, chairs for living room as well as beds, sofa set, wardrobes, side tables, dressing tables for bedroom and crockery cabinets, chest of drawers for kitchen especially in solid wood and sheesham furniture designs, so that it is easy and hassle free to buy furniture online. Our furniture is intelligently designed to give both comfort and functionality; while we also go to great lengths to ensure that we source only the highest quality raw materials and use the latest technologies to manufacture each individual piece.</p>
<br>
<br>
<h4>Wooden Furniture in Solid Wood & Sheesham Designs :</h4>

<p>Our exhaustive range offers multiple options in solid, mango, teak, rubber, acacia, ply, engineered and sheesham wood furniture pieces, while all our wooden furniture can also be customized to suit the individual needs of our customers. We also offer solid wood furniture in beds, dining tables, shoe racks, storage and reception cabinets at our online marketplace. See various designs side by side, compare prices and finishes and find exclusive modular furniture pieces that you would not find at local furniture stores.
</p>
<br><br>
<h4>Browse Furniture by Room Type :</h4>
<p>
Living Room Furniture Living room consists of your stylish and trending sofas, chairs and tables. They should be exquisitely designed and comfortable to sit on. These furniture pieces escalate the aesthetic appeal of your home.

Dining Room Furniture Apart from looking good, dining room furniture should also be efficient and robust, these include tables, chairs and cabinets. Always remember to emphasize on quality over quantity when it comes to dining room furniture.

Study Room Furniture A place to study and indulge in your passion for books. Study room consists of shelves, cases, cabinets and tables. They should be brilliantly designed and efficient to utilize.

Bedroom Furniture A room where you retire for the day should always be cozy and comfy. Bed room furniture include bedside tables, mattresses, dressing tables, beds and wardrobes. Its a combination of storage furniture pieces and bedroom essentials, ensure you get the best ones.

Kids Room Furniture A kids room requires colorful, safe and robust furniture pieces. Kids room consists of beds, bedside and study tables, cradles, sofas and book shelves. Do not compromise on quality while grabbing furniture for your kids room.

Outdoor Furniture Needless to say these furniture pieces do not have the comfort of being installed inside of your home, so they have to be sturdy and robust to handle the changing weather conditions. Outdoor furniture consist of chairs, swings, loungers, dining sets and tables. Grab these manufactured by reputed brands.

You can also avail discounts & offers on wide range of home decor, home furnishing, lamps & lighting, kitchen & dining, bath accessories, housekeeping, dining, bar accessories, hardware & electricals, Garden Products and kids Products. products, that suit your need. So go ahead now and take a good look at our online furniture shopping store.
	</p>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<!-- category -->
	<div class="row">
		<div class="col-sm-4">
			<iframe width="400" height="300"
				src="https://www.youtube.com/embed/i4pAlWhAxW0" frameborder="0"
				allowfullscreen></iframe>
		</div>
		<div class="col-sm-4">
			<iframe width="400" height="300"
				src="https://www.youtube.com/embed/zrTt9Y5zoyM" frameborder="0"
				allowfullscreen></iframe>
		</div>
		<div class="col-sm-4">
			<iframe width="400" height="300"
				src="https://www.youtube.com/embed/YB4bvvyl_ss" frameborder="0"
				allowfullscreen></iframe>
		</div>
	</div>
	 <%@include file="footer.jsp" %>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
<html>
<head>
	<title>Online Booking hotels</title>
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="shivv" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	
	<link rel="stylesheet" href="css/bootstrap.css">
	
	<link href="css/css_slider.css" type="text/css" rel="stylesheet" media="all">
	
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	
	<link href="css/font-awesome.min.css" rel="stylesheet">
	

	
	<link href="//fonts.googleapis.com/css?family=Crimson+Text:400,400i,600,600i,700,700i" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Oxygen:300,400,700&amp;subset=latin-ext" rel="stylesheet">
	
</head>


<body>
	<!-- main banner -->
	<div class="main-top" id="home">
		<!-- header -->
		<header>
			<div class="container-fluid">
				<div class="header d-md-flex justify-content-between align-items-center py-3 px-xl-5 px-lg-3 px-2">
					<!-- logo -->
					<div id="logo">
						<h1><a href="/home">:)</a></h1>
					</div>
					<!-- //logo -->
					<!-- nav -->
					<div class="nav_w3ls">
						<nav>
							<label for="drop" class="toggle">Menu</label>
							<input type="checkbox" id="drop" />
							<ul class="menu">
								<li><a href="/home" class="active">Home</a></li>
								<li><a href="/aboutus">About Us</a></li>
								<li><a href="/gallery">Gallery</a></li>
								<li>
									<!-- First Tier Drop Down -->
									<label for="drop-2" class="toggle toogle-2">Dropdown <span class="fa fa-angle-down" aria-hidden="true"></span>
									</label>
									<a href="#">Dropdown <span class="fa fa-angle-down" aria-hidden="true"></span></a>
									<input type="checkbox" id="drop-2" />
									<ul>
										<li><a href="/home" class="drop-text">Hyderabad</a></li>
										<li><a href="/chennai" class="drop-text">Chennai</a></li>
										<li><a href="/kerala" class="drop-text">Kerala</a></li>
										<li><a href="/singapore" class="drop-text">Singapore</a></li>
										<li><a href="/goa" class="drop-text">Goa</a></li>
										<li><a href="/kochii" class="drop-text">Kochii</a></li>
										<li><a href="/banglore" class="drop-text">Bangalore</a></li>
									</ul>
								</li>
								<li><a href="/contact">Contact Us</a></li>
								<li><a href="/cart" >ViewCart</a></li>
								<li><a href="/logout">Logout</a></li>
							</ul>
						</nav>
					</div>
					<!-- //nav -->
				</div>
			</div>
		</header>
		<!-- //header -->

		<!-- banner -->
		<div class="banner_w3lspvt-2">

		</div>
		<!-- //banner -->
	</div>
	<!-- //main banner -->

<div>

<table>
<c:forEach var="data" items="${cart}">
<tr>
<th> Hotel : </th><td><c:out value="${data}"/> </td> <td> <input type="button" value="Checkout"> </td>
</tr>

</c:forEach>

</table>

</div>


		</body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>

<head>
<title>Netfly</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>

<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<a href="<%=request.getContextPath() + "/Videoclub"%>" class="logo"><strong>Tienda
							Online peliculas</strong> Netfly</a>
				</header>

				<!-- Content -->
				<section>

					<!-- Content -->
					<h2 id="content"></h2>
					<p></p>

					<div class="col-6 col-12-small"></div>
					<div class="col-6 col-12-small"></div>

					<div class="row gtr-200">
						<div class="col-6 col-12-medium">
							<span class="image fit"><img src="images/netflix.jpg"
								alt="" /></span>
							<div class="box alt">
								<div class="row gtr-50 gtr-uniform">
									<c:forEach var="pelicula" items="${listado}">
										<div class="col-4">
											${pelicula.titulo} <span class="image fit"><img
												src=${pelicula.url } alt="" /></span>
										</div>
									</c:forEach>
								</div>
							</div>

						</div>
					</div>

				</section>

			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">

				<!-- Search -->
				<section id="search" class="alt">
					<form method="post" action="Videoclub">
						<input type="text" name="query" id="query" placeholder="Buscar pelicula" />
						<input type="submit" name="enter" id="enter" value="buscar"/>
					</form>
				</section>
				<!-- Menu -->
				<nav id="menu">
					<header class="major">
						<h2>Menu</h2>
					</header>
					<ul>
						<li><a href="<%=request.getContextPath() + "/Videoclub"%>">Peliculas</a></li>
						<li><span class="opener">Categoria</span>
							<ul>
								<li><a href="#">Ciencia Ficion</a></li>
								<li><a href="#">Animacion</a></li>
								<li><a href="#">Familiar</a></li>
							</ul></li>
					</ul>
				</nav>
				<header class="major">
					<h2>Get in touch</h2>
				</header>
				<ul class="contact">
					<li class="fa-home"><a href="Login.html">Administrador</a></li>
					<br>
					<li class="fa-phone">(000) 000-0000</li>
					<li class="fa-home">1234 Somewhere Road #8254<br />
						Nashville, TN 00000-0000
					</li>
				</ul>
				</section>

				<!-- Footer -->
				<footer id="footer">
					<p class="copyright">
						&copy; Untitled. All rights reserved. Demo Images: <a
							href="https://unsplash.com">Unsplash</a>. Design: <a
							href="https://html5up.net">HTML5 UP</a>.
					</p>
				</footer>

			</div>
		</div>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>


</body>

</html>

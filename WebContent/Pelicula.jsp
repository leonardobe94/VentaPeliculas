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
					<a href="Principal.jsp" class="logo"><strong>Tienda
							Online peliculas</strong> Netfly</a>
				</header>

				<!-- Content -->
				<section>
					<header class="main">
						  <h1>${pelicula.titulo}</h1>
						
					</header>
					<div class="box alt">
						<div class="row gtr-50 gtr-uniform">
							<div class="col-4">
								<span class="image fit"><img src=${pelicula.url} /> </span>
							</div>
						</div>
					</div>
					<h2 id="content">Ficha Tecnica</h2>
					<p>Categoria: ${pelicula.categoria}</p>
					<div class="col-6 col-12-small">
						<p>Director: ${pelicula.director}</p>
					</div>
					<div class="col-6 col-12-small">
						<p>FechaEstreno: ${pelicula.fechaEstreno}</p>
					</div>
					<div class="col-6 col-12-small">
						<p>Sinopsis: ${pelicula.resumen}</p>
					</div>
</body>
</html>
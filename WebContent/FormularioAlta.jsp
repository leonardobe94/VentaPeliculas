<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<!--
	Editorial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>

<head>
    <title>Formulario de Altas</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="assets/css/main.css" />
</head>

<body class="is-preload">

    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Tienda Online peliculas</strong> Netfly</a>
    </header>

    <!-- Content -->
    <section class="align-center">
        <div class="align-center">
            <!-- Form >-->
            <h2>Formulario de Altas</h2>

            <form method="post" action="#">
                <div class="row gtr-uniform">
                   <div class="col-6 col-12-xsmall">
                       <p>Sube la imagen de la pelicula: </p>
                        <input name="uploadedfile" type="file" /> 
                        <input type="submit" value="Subir archivo" />
                    </div>
                     <div class="col-5">
                            </div>
                    <div class="col-6 col-12-xsmall">
                       <div class="col-3 col-12-xsmall">
                        <p>Pon el titulo de la Pelicula: </p>
                            <input type="text" name="titulo" id="titulo" value="" placeholder="Titulo" />
                            </div>
                    </div>
                     <div class="col-5">
                            </div>
                    <div class="col-8">
                       <p>Pon el Resumen de la pelicula: </p>
                        <textarea name="Resumen" id="Resumen" placeholder="Ponga su Resumen" rows="6"></textarea>
                    </div>
                     <div class="col-5">
                            </div>
                    <div class="col-8">
                       <p>Pon la fecha de la pelicula: </p>
                        <input type="text" name="Fecha" id="Fecha" placeholder="Fecha" />
                    </div>
                     <div class="col-5">
                            </div>
                    <div class="col-8">
                       <p>Pon el Director de la pelicula:</p>
                        <input type="text" name="Director" id="Director" placeholder="Director"/>
                    </div>
                     <div class="col-5">
                            </div>
                    <div class="col-8">
                       <p>Pon la categoria de la pelicula: </p>
                        <input type="text" name="categoria" id="categoria" placeholder="categoria" />
                    </div>
                    <div class="col-5">
                            </div>
                    <div class="col-8, align-center">
                        <input type="submit" value="Dar de Alta" />
				        <input type="reset" value="Reset" />
                    </div>
                

                </div>
            </form>

        </div>
    </section>

   

    <!-- Scripts -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/browser.min.js"></script>
    <script src="assets/js/breakpoints.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>


</body>

</html>

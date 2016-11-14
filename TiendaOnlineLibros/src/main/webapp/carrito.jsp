<%@page errorPage="pagError.jsp" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Libreria Leame</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="wrapper">
	<div id="inner">
       
    <%@ include file="cabecera.jsp"%>
<!-- cabecera -->
    <%@ include file="panel_lateral.jsp"%>
<!--Panel lateral-->
    
		<div id="body">
<div class="inner">
                <p id="titulo">BIENVENIDO A SU CARRO DE COMPRA</p>
                 <div class="leftbox">
					<h3><b>¿Cuánto vale la x?</b></h3>
					<img src="images/cctecnicas_lax.jpg" width="100" height="157" alt="photo 1" class="left" />
					<p>Autor: <b>Vicente Meavilla</b> </p>
                     <p>ISBN: 9788415828228</p>
                    <p>Precio: <b>21,94 EUR</b>.</p>
					<div class="clear"></div>
				</div>
<!-- / leftbox -->
				<div class="rightbox">
					<h3><b>Por amor a la Física</b> </h3>
					<img src="images/cctecnicas_amorfisica.jpg" width="100" height="153" alt="photo 4" class="left" />
					<p>Autor: <b>Walter Lewin</b></p>
                    <p>ISBN: 9788490320594</p>
                    <p>Precio: <b>10,08 EUR</b>.</p>
					<div class="clear"></div>
				</div>
<!-- / rightbox -->
				<div class="clear br"></div>
				<div class="leftbox">
					<h3><b>365 enigmas y juegos de lógica</b></h3>
					<img src="images/ocio_enigmasyjuegos.jpg" width="100" height="150" alt="photo 6" class="left" />
					<p>Autor: <b>Miquel Capó Dolz</b></p>
                    <p>ISBN: 9788484412267</p>
                    <p>Precio: <b>13,95 EUR</b>.</p>
					<div class="clear"></div>
				</div>
<!-- / leftbox -->
				<div class="rightbox">
					<h3><b>Manual de escritura de los caracteres chinos</b></h3>
					<img src="images/idiomas_chino.jpg" width="100" height="141" alt="photo 6" class="left" />
					<p>Autor: <b>Pedro Ceinos Arcones</b></p>
                    <p>ISBN: 9788478131730</p>
                    <p>Precio: <b>24,30 EUR</b>.</p>
					<div class="clear"></div>
				</div>
				
				<p id="precio"><strong>PRECIO TOTAL: </strong><b>70,27 EUR</b>.</p>
		
<!-- /rightbox -->
		</div>
<!-- / inner -->
		</div>
<!-- / body -->
		<div class="clear"></div>
		
<!-- / footer -->
	</div>
<!-- / inner -->
</div>
<!-- / wrapper -->
</body>
</html>
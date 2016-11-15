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
       
        <div id="logocategoria">Categoría: Idiomas</div>
		<div id="body">
			<div class="inner">
				<c:forEach items="${categorias}"  var="libro">
			        <div class="box">
					<h3><b>${libro.nombre}</b></h3>
					<img src="${libro.url}" width="103" height="142" alt="photo 1" class="left" />
					<p>Autor:<b>${libro.autor}</b></p>
                     <p>ISBN: ${libro.isbn}</p>
                    <p>Precio:<b> ${libro.precio}</b>.</p>
					<p class="readmore"><a href="#"><b>Añadir al carrito</b></a></p>
					<div class="clear"></div>
				</div>
		</c:forEach>				
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
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
<!-- / header -->
    <%@ include file="panel_lateral.jsp"%>
<!--Panel lateral-->

<div id="body">
            <div id="body header">
                <h1 id="titulo">Regístrate</h1>
            </div>
            <div id="main">
                <form action="?" method="post">
                    <fieldset>
                        <p>
                            <label for="nombre"> Nombre:</label>
                            <input type="text" class="formulario" name="nombre" />
                        </p>
                        <p>
                            <label for="apellido1">Primer apellido:</label>
                            <input type="text" size="5" class="formulario" name="apellido1" />
                        </p>  
                         <p>
                            <label for="apellido2">Segundo apellido:</label>
                            <input type="text" size="5" class="formulario" name="apellido2" />
                        </p> 
                         <p>
                            <label for="direccion">Indique su direccion :</label>
                            <input type="text" size="5" class="formulario" name="direccion" />
                        </p> 
                         <p>
                            <label for="ciudad">Ciudad:</label>
                            <input type="text" size="5" class="formulario" name="ciudad" />
                        </p> 
                              <p>
                            <label for="provincia">Provincia:</label>
                            <input type="text" size="5" class="formulario" name="provincia" />
                        </p>  
                        <p>
                            <label for="pais">País:</label>
                            <input type="text" size="5" class="formulario" name="pais" />
                        </p>  
                        <p>
                            <label for="codigoPostal">Código Postal:</label>
                            <input type="number" size="5" class="formulario" name="codigoPostal" />
                        </p>  
                        <p>
                            <label for="email">Email:</label>
                            <input type="email" size="5" class="formulario" name="email" />
                        </p> 
                           <p>
                            <label for="telefono1"> Introduzca un primer número de contacto:</label>
                            <input type="number" size="5" class="formulario" name="telefono1" />
                        </p>
                        <p>
                            <label for="telefono2">Introduzca un segundo número de contacto:</label>
                            <input type="number" size="5" class="formulario" name="telefono2" />
                        </p>
                        <p>
                            <label for="fechaNacimiento">Introduzca su fecha de nacimiento:</label>
                            <input type="date" size="5" class="formulario" name="fechaNacimiento" />
                        </p>
                        
                       <p>
                            <label for="password">Indique una contraseña:</label>
                            <input type="password" size="5" class="formulario" name="password" />
                        </p>
                        <p>
                           <input type="image" id="boton_avanzada" src="images/boton_darme_alta.jpg" /> 
                            
                        </p>
                       <!-- <p>
                            <input type="submit" value="Darme de alta como cliente" />
                        </p>-->
                    </fieldset>
                </form>
            </div>
        </div>
<!-- / inner -->
		</div>
<!-- / body -->
		<div class="clear"></div>
		
<!-- / footer -->
	</div>
<!-- / inner -->

<!-- / wrapper -->
</body>
</html>
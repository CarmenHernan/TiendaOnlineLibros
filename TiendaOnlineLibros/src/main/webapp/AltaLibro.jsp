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
       
    <%@ include file="cabecera.jsp"%> <!--Diapositiva 136-138-->
    <!-- / header -->
    <%@ include file="panel_lateral.jsp"%>
<!--Panel lateral-->

<div id="body">
            <div id="body header">
                <h1 id="titulo">Alta libro</h1>
            </div>
            <div id="main">
                <form action="?" method="post">
                    <fieldset>
                        
                        <p>
                            <label for="titulo" class> Título:</label>
                            <input type="text" class="formulario" name="titulo" />
                        </p>
                        <p>
                            <label for="autor"> Autor:</label>
                            <input type="text" size="5" class="formulario" name="autor" />
                        </p>  
                         <p>
                            <label for="isbn"> ISBN:</label>
                            <input type="number" size="5" class="formulario" name="isbn" />
                        </p> 
                           <p>
                         <label for="precio"> Precio:</label>
                            <input type="number" size="5" class="formulario" name="precio" />
                        </p>
                         <p>
                         <label for="edicion"> Edición:</label>
                            <input type="number" size="5" class="formulario" name="edicion" />
                        </p>
                         <p>
                         <label for="fechaPublicacion"> Fecha de publicación:</label>
                            <input type="date" size="5" class="formulario" name="fechaPublicacion" />
                        </p>
                         <p>
                         <label for="descripcion"> Descripción:</label>
                            <input type="text" size="5" class="formulario" name="descripcion" />
                        </p>
                         <p>
                         <label for="stock"> Stock:</label>
                            <input type="number" size="5" class="formulario" name="stock" />
                        </p>
                         <p>
                         <label for="editorial"> Editorial:</label>
                            <input type="text" size="5" class="formulario" name="editorial" />
                        </p>
                        <p>
                         <label for="categoria">Categoria:</label>
                            <input type="text" size="5" class="formulario" name="categoria" />
                        </p>
                     
                    
 
                         <p>
                           <input type="image" id="boton_avanzada" src="images/boton_alta_libro.jpg" /> 
                            
                        </p>
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
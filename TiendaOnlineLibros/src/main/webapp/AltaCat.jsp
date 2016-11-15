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
                <h1 id="titulo">Alta categor�a</h1>
            </div>
            <div id="main">
            
            
            <form:form modelAttribute="categoria" action="save" method="POST">
                	
                    <fieldset>
                        <p>
                        	<label for="nombre"> Nombre:</label>
                            <input type="text" class="formulario" name="nombre" />
                        </p>   
                       
                       
                       <p>
                            <label for="idLibro"> C�digo del libro:</label>
                            <input type="text" size="5" class="formulario" name="idLibro" />
                        </p>


                        <p>
                           <input type="image" id="boton_avanzada" src="images/boton_modificar_categoria.jpg" />    
                        </p>
                        
                    </fieldset>
                </form:form>
       

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
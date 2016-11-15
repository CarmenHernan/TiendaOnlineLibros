<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <h1 id="titulo">Modificar categoría</h1>
            </div>
            <div id="main">
                
                <form:form modelAttribute="categoria" action="update" method="POST">
                	<form:hidden path="idCategoria" />
                	
                    <fieldset>
                        <p>
                        	<form:label path="nombre">Nombre:</form:label>
            				<form:input path="nombre" />
                        </p>   
                       
                       
                        
                  <!--  <p>
                        	<form:label path="idLibro">Código del libro:</form:label>
            				<form:input path="idLibro" />    
                        </p>  -->

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
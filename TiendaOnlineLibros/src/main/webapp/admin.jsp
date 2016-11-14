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
            
            <div id="main">
                  
                <div id="todo">
   <h1>Administración</h1>
   
   
   <div id="usuario">
   <br/>
    <a href="implUsuarioControlador.do?operacion=listado">
            <img src="images/icono-usuario-verde.jpg" width="100" height="140" alt="categorias" />
            </a>
    <br/>
            <h2> Usuarios</h2>
            <br/>
             
              </div>
                
                
                <div id="libros">
        <br/>
         <a href="implLibroControlador.do?operacion=listado">
            <img src="images/icono-libro-verde.jpg" width="100" height="140" alt="categorias" />
            </a>
            <br/>
            <h2>Libros</h2>
            <br/>
           
   </div>
   
   
   
                
                <div id="categorias">
            <br/>
            <a href="implCategoriaControlador.do?operacion=listado">
            <img src="images/icono-categoria-verde.jpg" width="100" height="140" alt="categorias" />
            </a>
            
            <br/>
            <h2>Categorias</h2>
            <br/>
            
            
   
   
   
</div>
                
                
                
                
                
                
                
                
                
                
                
                
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
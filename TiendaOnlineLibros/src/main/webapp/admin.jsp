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
    <img src="images/icono-usuario-verde.jpg" width="100" height="140" alt="usuarios" />
    <br/>
            <h2> Usuarios</h2>
            <br/>
             
             <input class="admin" href="ModificarUsuario.jsp" type="image" src="images/boton_modificar_usuario.jpg" />
           <br/>
            <input class="admin" href="BajaCliente.jsp" type="image" src="images/boton_eliminar_usuario.jpg" />
                </div>
                
                
                <div id="libros">
        <br/>
            <img src="images/icono-libro-verde.jpg" width="100" height="140" alt="libros"  />
            <br/>
            <h2>Libros</h2>
            <br/>
            <input class="admin" href="AltaLibro.jsp" type="image" src="images/boton_alta_libro.jpg" />
            <br/>
          <input class="admin" href="ModificarUsuario.jsp" type="image" src="images/boton_modificar_libro.jpg" />
             <br/>
         <input class="admin" href="BajaLibro.jsp" type="image" src="images/boton_eliminar_libro.jpg" />
   
   </div>
   
   
   
                
                <div id="categorias">
            <br/>
            <img src="images/icono-categoria-verde.jpg" width="100" height="140" alt="categorias" />
            <br/>
            <h2>Categorias</h2>
            <br/>
     <input class="admin" href="AltaCategoria.jsp" type="image" src="images/boton_alta_categoria.jpg" />
            <br/>
          <input class="admin" href="ModificarCategoria.jsp" type="image" src="images/boton_modificar_categoria.jpg" />
            <br/>
   <input class="admin" href="BajaCategoria.jsp" type="image" src="images/boton_eliminar_categoria.jpg" />
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
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

            <div id="body header">
                <h1>  </h1>
            </div>
            <div id="main">
               <div id="formulario_login">
                <form action="resulta_busqueda.jsp" method="post">
                    <fieldset>
                        <legend id=titulo> Su cuenta </legend>
                        <p>
                            <label for="email"> Email:</label>
                            <input type="email" class="formulario" name="email" />
                        </p>
                        <p>
                            <label for="password"> Password:</label>
                            <input type="password" size="5" class="formulario" name="password" />
                        </p>  
                        <input id="boton_entrar" type="image" src="images/boton_entrar_grande.jpg"/>
                   
                <!--    <input id="boton_entrar" type="image" src="images/boton_entrar_grande.jpg" /> 
                             <!--<input type="submit" value="Buscar" id="buscar_avanzada"/> -->
                        
                       
                    </fieldset>   
                </form>
               
                 </div>
                 <div id="formulario_registro">
                 <form action="registro_cliente.jsp" method="get">
                     <fieldset>
                         <legend id=titulo> Sea bienvenido </legend>
                        <p>Si usted aun no se ha registrado, por favor, haga click en el siguiente boton para darse de alta en nuestra tienda.
                         </p> 
                         
                         <input id="boton_alta" type="image" src="images/boton_darme_alta.jpg" />
                     </fieldset>
                       
                 </form>
                   
                </div>
              
             </div>
                     
        </div>
<!-- / rightbox -->
				<div class="clear"></div>
			</div>
<!-- / inner -->
		
<!-- / body -->
		<div class="clear"></div>

<!-- / inner -->

<!-- / wrapper -->
</body>
</html>
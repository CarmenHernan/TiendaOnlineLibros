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
            <div id="body">
            <div id="body header">
                <h1>  </h1>
            </div>
            <div id="main">
                <form action="resulta_busqueda.jsp" method="post">
                    <fieldset>
                        <legend id=titulo>Búsqueda avanzada</legend>
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
                       Precio máximo que quieres gastar(en euros):
                            <script>
                                    function evalSlider()
                                        {
                                            var sliderValue=document.getElementById('rating').value;
                                            document.getElementById('sliderVal').innerHTML=sliderValue;
                                        }
                            </script>

                        <input type="range" id="rating" min="0" max="90" onchange="evalSlider()"/>
                        <output id="sliderVal"></output>
                        </p>
                        
                        <p>
                           <input type="image" id="boton_avanzada" src="images/boton_buscar2_reducida.jpg" /> 
                             <!--<input type="submit" value="Buscar" id="buscar_avanzada"/> -->
                        </p>
                    </fieldset>   
                </form>
             </div>
                     
        </div>
<!-- / rightbox -->
				<div class="clear"></div>
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
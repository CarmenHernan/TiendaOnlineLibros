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
            <div id="body header">
                <h1 id="titulo">Eliminar libro</h1>
            </div>
            <div id="main">
                <form action="?" method="post">
                    <fieldset>
                       
                        <p>
                            <label for="idLibro">C�digo:</label>
                            <input type="number" size="5" class="formulario" name="idLibro" />
                        </p>  
                       
                         
                    </fieldset>
                </form>
            </div>
       
<!-- / main -->
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
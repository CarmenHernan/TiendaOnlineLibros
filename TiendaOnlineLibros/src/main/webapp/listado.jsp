<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
        </div>       
        <div id="main">
        <div id="contenedor">
            <div>        
                <h3>LISTADO DE CATEGORIAS</h3>
                <table border="1">
                    <thead>
                        <tr>
                            <th>CATEGORIA</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="categoria" items="${categoria}">
                            <tr>
                                <td>${categoria.nombre}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <br/>
                <br/>
            
            </div>
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
		<div id="panel_lateral">
        <dl id="browse">
			<dt>Lista de categorías</dt>
			<dd class="first"/>
		<c:forEach items="${categorias}" var="categoria">
			<tr>
				<a id=${categorias.nombre} href="categoria.jsp">${categorias.nombre}</a>

			</tr>
		</c:forEach>
		</dl>
        </div>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<nav>
	<a href="${pageContext.request.contextPath}/"><img class="logo" src="img/security-icon.png" width="80"></a><br/><br/> <span class="seguridad">Sistema de Seguridad </span><br/><br/><br/><br/><br/>
	<ul id="menu">
		<li><a href="${pageContext.request.contextPath}/">Inicio</a></li>
       <li><a href="${pageContext.request.contextPath}/mantenimientoMaestros">Maestros</a></li>
       <li><a href="${pageContext.request.contextPath}/mantenimientoSistema">Sistema</a></li>
       <li><a href="${pageContext.request.contextPath}/mantenimientoUsuarios">Usuarios</a></li>
	</ul>
</nav>
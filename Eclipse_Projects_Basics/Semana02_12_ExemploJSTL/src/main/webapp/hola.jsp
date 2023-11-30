<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo JSTL</title>
</head>
<body>

<c:out value="hola desde jstl"></c:out>

<c:set var="nombre" value="pepito"/>
<c:remove var="nombre" />
 
<c:if test="${param.numero} <5}">
                <c:out value="No se que"></c:out>
</c:if>


<c:choose>

<c:when test="${param.numero}>=25 }">
                <c:out value="No se cuantos"></c:out>
</c:when>
<c:otherwise>
                <c:out value="No se cuantitos"></c:out>

</c:otherwise>

</c:choose>

</body>
</html>
<%-- 
    Document   : crear-cliente
    Created on : Sep 19, 2020, 8:16:59 PM
    Author     : pablo.suazo1
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Cliente</title>
    </head>
    <body>
        <h1>Crear Cliente</h1>
        <span>${mensaje}</span>
        
        <form:form method="post" 
                   action="cliente/crear" 
                   modelAttribute="cliente">

            <form:label path="codCliente">Código Clietne:</form:label> 
            <form:input path="codCliente"  />
            <br/>
            
            <form:label path="nit">NIT:</form:label> 
            <form:input path="nit" />
            <br/>

            <form:label path="nombre">Nombre Cliente:</form:label> 
            <form:input path="nombre" />
            <br/>

            <form:label path="direccion">Dirección:</form:label> 
            <form:textarea path="direccion" />
            <br/>

            <form:button class="">Enviar</form:button>
        </form:form>
        
    </body>
</html>

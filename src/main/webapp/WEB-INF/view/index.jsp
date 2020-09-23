<%-- 
    Document   : index
    Created on : Sep 19, 2020, 5:09:58 PM
    Author     : pablo.suazo1
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Examen Parcial I</title>
    </head>
    <body>
        <h1>BIENVENIDO</h1><br/>
        <h3>Listado de Clientes</h3><br/>
        <a href="cliente">Crear Clientes</a>
        
        <table>
            <thead>
                <tr>
                    <th>Código Cliente</th>
                    <th>NIT</th>
                    <th>Nombre</th>
                    <th>Dirección</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${clienteList}" var="cliente">
                    <tr>
                        <td>${cliente.codCliente}</td> 
                        <td>${cliente.nit}</td> 
                        <td>${cliente.nombre}</td> 
                        <td>${cliente.direccion}</td> 
                        <td><a href="cliente/codigo/${cliente.codCliente}">Modificar</a></td> 
                        <td><a href="cliente/eliminar/${cliente.codCliente}">Eliminar</a></td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>        
    </body>
</html>

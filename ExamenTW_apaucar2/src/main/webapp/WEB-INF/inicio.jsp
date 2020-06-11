<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList"%> 
<%@ page import = "com.examen.tw.entity.*"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Examen TW</title>
        <style type="text/css" media="screen">
        <%@ include file="estilos.css" %>
        </style>
    </head>
    <body>
        <h3>Prueba asíncrona Tecnologías Web</h3>  
        <h3>Alumno: Alex Paucar Pimentel</h3>  
        <h3>DNI: 44637440Y</h3>  
        <br>
        
        <h2>Búsqueda en BBDD</h2>
        
   	   <form action = "/salida" method = "POST">
   	   
   	   	 ID: <input type = "text" name = "id">
         <br />
         Nombre: <input type = "text" name = "nombre">
         <br />
         PrimerApellido: <input type = "text" name = "apellido1" />
         <br />
         SegundoApellido: <input type = "text" name = "apellido2">
         <br />
         Teléfono: <input type = "text" name = "movil">
         <br />
         
         <input type = "submit" value = "Buscar"/>
      </form>
        
   

    </body>
</html>
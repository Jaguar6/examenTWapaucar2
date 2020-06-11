<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList"%> 
<%@ page import = "java.util.List"%>
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
        
        <h2>Resultado de Búsqueda</h2>
        	
   	
            <% 
            
            String id = request.getParameter("id"); 
            String nombre= request.getParameter("nombre");
            String apellido1= request.getParameter("apellido1");
            String apellido2= request.getParameter("apellido2");
            String movil = request.getParameter("movil");
            
            ArrayList<Persona> lista = Conexion.buscarDatos(id,nombre,apellido1,apellido2,movil); 
            for (int i=0;i<lista.size();i++)
            {
               out.println("<tr>");
               out.println("<td>"+lista.get(i).getId()+"</td>");
               out.println("<td>"+lista.get(i).getNombre()+"</td>");
               out.println("<td>"+lista.get(i).getApellido1()+"</td>");
               out.println("<td>"+lista.get(i).getApellido2()+"</td>");
               out.println("<td>"+lista.get(i).getMovil()+"</td>");
               out.println("</tr>");
               out.println("<br>");
            }
            
            if(lista.size()==0){
            	 out.println("Ninguna coincidencia");
            }
            %>
            

    </body>
   </html>
package com.examen.tw.entity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Conexion {

	
	public static ArrayList<Persona> buscarDatos(String id,String nombre,String apellido1,String apellido2,String movil)
	   {
		
		  ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
	      try
	      {
	         Class.forName("org.h2.Driver");
	         Connection conexion = DriverManager.getConnection(
	            "jdbc:h2:mem:test", "apaucar2", "alumno");
	         Statement st = conexion.createStatement();
	         ResultSet rs = st.executeQuery("select * from Personas" );
	         
	         //Recopilo toda la base de datos
	         while (rs.next())
	         {
	            Persona persona = new Persona();
	            
	            persona.setId(rs.getInt("id"));
	            persona.setNombre(rs.getString("nombre"));
	            persona.setApellido1(rs.getString("apellido1"));
	            persona.setApellido2(rs.getString("apellido2"));
	            persona.setMovil(rs.getString("movil"));
	             
	            listaPersonas.add(persona);
	           
	         }
	         rs.close();
	         st.close();
	         conexion.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      
	      Iterator<Persona> itr = listaPersonas.iterator();
	      while(itr.hasNext()) {
	    	  Persona p = itr.next();
	    	  
	    	  int num = p.getId();
	    	  String ns = ""+num;
	    	  
	    	  if(!ns.equals(id)) {
	    		if(!p.getNombre().equals(nombre)){
	    			if(!p.getApellido1().equals(apellido1)) {
	    				if(!p.getApellido2().equals(apellido2)) {
	    					if(!p.getMovil().equals(movil)) {
	    	    				itr.remove();
	    	    			}
		    			}
	    			}
	    		}
	    	  }
	      }
	      
	      return listaPersonas;
	   }
	
}

package com.examen.tw.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="Personas")
public class Persona implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		private int id;
			
		private String nombre;
			
		private String apellido1;
			
		private String apellido2;
			
		private String movil;
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public String getMovil() {
			return movil;
		}

		public void setMovil(String movil) {
			this.movil = movil;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}

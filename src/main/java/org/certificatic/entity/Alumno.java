package org.certificatic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="alumnos_2")
@XmlRootElement
public class Alumno {

	@Id
	@GeneratedValue
	private int idAlumno;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Alumno() {
		
	}
	
	
	public Alumno(String nombre, String apellido, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public int getIdAlumno() {
		return idAlumno;
	}


	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + "]";
	}

	
	
	
	
}

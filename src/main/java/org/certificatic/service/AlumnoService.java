package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.entity.Alumno;

@WebService
public interface AlumnoService {

	Alumno guardarAlumno(Alumno alumno);
	
	List<Alumno> obtenerAlumnos();
	
	public void save(Alumno alumno);
	
	public List<Alumno> findAll();

}

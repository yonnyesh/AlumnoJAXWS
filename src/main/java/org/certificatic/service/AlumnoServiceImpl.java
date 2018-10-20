package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.dao.AlumnoDAO;
import org.certificatic.dao.AlumnoDAOImpl;
import org.certificatic.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;


@WebService(endpointInterface = "org.certificatic.service.AlumnoService")
public class AlumnoServiceImpl implements AlumnoService {

	
	//AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoDAO.guardarAlumno(alumno);
	}

	@Override
	public List<Alumno> obtenerAlumnos() {
		return alumnoDAO.obtenerAlumnos();
	}

	@Override
	public void save(Alumno alumno) {
		alumnoDAO.save(alumno);
		alumnoDAO.guardarAlumno(alumno);
		
	}

	@Override
	public List<Alumno> findAll() {
		return alumnoDAO.findAll();
	}

}

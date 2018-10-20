package org.certificatic.dao;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.entity.Alumno;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AlumnoDAOImpl implements AlumnoDAO{
	
	static List<Alumno> alumnos= new ArrayList<>();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		//alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> obtenerAlumnos() {
		return alumnos;
	}

	@Override
	public void save(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnos.add(alumno);
		//return alumno;
		getSession().save(alumno);
	}

	@Override
	public List<Alumno> findAll() {
		Query query = getSession().createQuery("FROM Alumno");
		
		return query.list();
	}



}

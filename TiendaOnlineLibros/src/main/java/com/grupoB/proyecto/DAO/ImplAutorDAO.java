package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import com.grupoB.proyecto.util.Sesion;
import com.grupoB.proyecto.DAO.*;

public class ImplAutorDAO implements I_DAO<Autor,Integer> {
	private Sesion sesion;

	public ImplAutorDAO () {
		sesion=new Sesion();
	}

	public void persist(Autor entity) {


	sesion.getCurrentSession().save(entity);
	}
	// POR ESO YA PONGO PERSIST, PORQUE EN REALIDAD USA SAVE (IGUAL QUE EN EL
	// ANTERIOR)
	// (PERSIST ES EL NOMBRE QUE LE DA ANTONIO, NO TIENE Q VER CON EL JPA)

	public void update(Autor entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Autor findById(Integer id) {
		Autor autor = (Autor) sesion.getCurrentSession().get(Autor.class, id);
		return autor;
	}

	public void delete(Autor entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Autor autor = findById(id);
		delete(autor);
	}

	@SuppressWarnings("unchecked")
	public List<Autor> findAll() {
		List<Autor> autores = (List<Autor>) sesion.getCurrentSession().createQuery("from Autor").list();
		return autores;
	}

	public void deleteAll() {
		List<Autor> entityList = findAll();
		for (Autor entity : entityList) {
			delete(entity);
		}
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}

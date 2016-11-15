package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplLibroDAO implements I_DAO<Libro,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplLibroDAO () {
		
	}
	public ImplLibroDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Libro entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Libro entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Libro findById(Integer id) {
		Libro libro = (Libro) sessionFactory.getCurrentSession().get(Libro.class, id);
		return libro;
	}


	
	@Transactional
	public void delete(Libro entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Libro libro = findById(id);
		delete(libro);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Libro> findAll() {
		List<Libro> libros = (List<Libro>) sessionFactory.getCurrentSession().createQuery("from Libro").list();
		return libros;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Libro> entityList = findAll();
		for (Libro entity : entityList) {
			delete(entity);
		}
	}

	
}

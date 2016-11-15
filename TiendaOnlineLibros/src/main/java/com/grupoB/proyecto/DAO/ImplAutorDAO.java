package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplAutorDAO implements I_DAO<Autor,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplAutorDAO () {
		
	}
	public ImplAutorDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Autor entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Autor entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Autor findById(Integer id) {
		Autor autor = (Autor) sessionFactory.getCurrentSession().get(Categoria.class, id);
		return autor;
	}


	
	@Transactional
	public void delete(Autor entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Autor autor = findById(id);
		delete(autor);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Autor> findAll() {
		List<Autor> autores = (List<Autor>) sessionFactory.getCurrentSession().createQuery("from Autor").list();
		return autores;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Autor> entityList = findAll();
		for (Autor entity : entityList) {
			delete(entity);
		}
	}

	
}

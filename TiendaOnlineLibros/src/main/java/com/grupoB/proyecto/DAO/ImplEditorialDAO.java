package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplEditorialDAO implements I_DAO<Editorial,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplEditorialDAO () {
		
	}
	public ImplEditorialDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Editorial entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Editorial entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Editorial findById(Integer id) {
		Editorial editorial = (Editorial) sessionFactory.getCurrentSession().get(Editorial.class, id);
		return editorial;
	}


	
	@Transactional
	public void delete(Editorial entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Editorial editorial = findById(id);
		delete(editorial);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Editorial> findAll() {
		List<Editorial> editoriales = (List<Editorial>) sessionFactory.getCurrentSession().createQuery("from Editorial").list();
		return editoriales;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Editorial> entityList = findAll();
		for (Editorial entity : entityList) {
			delete(entity);
		}
	}

	
}

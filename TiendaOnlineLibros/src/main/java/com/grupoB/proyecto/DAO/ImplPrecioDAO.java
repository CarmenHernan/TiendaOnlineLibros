package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplPrecioDAO implements I_DAO<Precio,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplPrecioDAO () {
		
	}
	public ImplPrecioDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Precio entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Precio entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Precio findById(Integer id) {
		Precio precio = (Precio) sessionFactory.getCurrentSession().get(Precio.class, id);
		return precio;
	}


	
	@Transactional
	public void delete(Precio entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Precio precio = findById(id);
		delete(precio);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Precio> findAll() {
		List<Precio> precio = (List<Precio>) sessionFactory.getCurrentSession().createQuery("from Precio").list();
		return precio;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Precio> entityList = findAll();
		for (Precio entity : entityList) {
			delete(entity);
		}
	}

	
}

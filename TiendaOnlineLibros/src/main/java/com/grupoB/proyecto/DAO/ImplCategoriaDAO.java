package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplCategoriaDAO implements I_DAO<Categoria,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplCategoriaDAO () {
		
	}
	public ImplCategoriaDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Categoria entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Categoria entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Categoria findById(Integer id) {
		Categoria categoria = (Categoria) sessionFactory.getCurrentSession().get(Categoria.class, id);
		return categoria;
	}


	
	@Transactional
	public void delete(Categoria entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Categoria categoria = findById(id);
		delete(categoria);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Categoria> findAll() {
		List<Categoria> categorias = (List<Categoria>) sessionFactory.getCurrentSession().createQuery("from Categoria").list();
		return categorias;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Categoria> entityList = findAll();
		for (Categoria entity : entityList) {
			delete(entity);
		}
	}

	
}

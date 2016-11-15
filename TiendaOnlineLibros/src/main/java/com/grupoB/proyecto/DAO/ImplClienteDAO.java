package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplClienteDAO implements I_DAO<Cliente,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplClienteDAO () {
		
	}
	public ImplClienteDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Cliente entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Cliente entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Cliente findById(Integer id) {
		Cliente cliente = (Cliente) sessionFactory.getCurrentSession().get(Categoria.class, id);
		return cliente;
	}


	
	@Transactional
	public void delete(Cliente entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Cliente cliente = findById(id);
		delete(cliente);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		List<Cliente> clientes = (List<Cliente>) sessionFactory.getCurrentSession().createQuery("from Cliente").list();
		return clientes;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Cliente> entityList = findAll();
		for (Cliente entity : entityList) {
			delete(entity);
		}
	}

	
}

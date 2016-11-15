package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplLibroPedidoDAO implements I_DAO<Libropedido,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplLibroPedidoDAO () {
		
	}
	public ImplLibroPedidoDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Libropedido entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Libropedido entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Libropedido findById(Integer id) {
		Libropedido libropedido = (Libropedido) sessionFactory.getCurrentSession().get(Libropedido.class, id);
		return libropedido;
	}


	
	@Transactional
	public void delete(Libropedido entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Libropedido libropedido = findById(id);
		delete(libropedido);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Libropedido> findAll() {
		List<Libropedido> libropedido = (List<Libropedido>) sessionFactory.getCurrentSession().createQuery("from Libropedido").list();
		return libropedido;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Libropedido> entityList = findAll();
		for (Libropedido entity : entityList) {
			delete(entity);
		}
	}

	
}

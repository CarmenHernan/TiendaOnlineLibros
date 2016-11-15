package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplPedidoDAO implements I_DAO<Pedido,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplPedidoDAO () {
		
	}
	public ImplPedidoDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Pedido entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Pedido entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Pedido findById(Integer id) {
		Pedido pedido = (Pedido) sessionFactory.getCurrentSession().get(Pedido.class, id);
		return pedido;
	}


	
	@Transactional
	public void delete(Pedido entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Pedido pedido = findById(id);
		delete(pedido);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Pedido> findAll() {
		List<Pedido> pedidos = (List<Pedido>) sessionFactory.getCurrentSession().createQuery("from Pedido").list();
		return pedidos;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Pedido> entityList = findAll();
		for (Pedido entity : entityList) {
			delete(entity);
		}
	}

	
}

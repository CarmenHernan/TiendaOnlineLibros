package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ImplStockDAO implements I_DAO<Stock,Integer> {
	//trabaja con el objeto hibernate
	//dao es la ultima capa,x eso se le pasa objeto hibernate
	 // es para q me inyecten
    @Autowired
	private SessionFactory sessionFactory;

	public ImplStockDAO () {
		
	}
	public ImplStockDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void persist(Stock entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	@Transactional
	public void update(Stock entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	@Transactional
	public Stock findById(Integer id) {
		Stock stock = (Stock) sessionFactory.getCurrentSession().get(Stock.class, id);
		return stock;
	}


	
	@Transactional
	public void delete(Stock entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Stock stock = findById(id);
		delete(stock);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Stock> findAll() {
		List<Stock> stock = (List<Stock>) sessionFactory.getCurrentSession().createQuery("from Stock").list();
		return stock;
	}

	
	@Transactional
	//usa el método de arriba
	public void deleteAll() {
		List<Stock> entityList = findAll();
		for (Stock entity : entityList) {
			delete(entity);
		}
	}

	
}

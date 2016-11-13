// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Pedido.
 * 
 * @see .Pedido
 * @author Hibernate Tools
 */
@Stateless
public class PedidoHome {

	private static final Log log = LogFactory.getLog(PedidoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Pedido transientInstance) {
		log.debug("persisting Pedido instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Pedido persistentInstance) {
		log.debug("removing Pedido instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Pedido merge(Pedido detachedInstance) {
		log.debug("merging Pedido instance");
		try {
			Pedido result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pedido findById(Integer id) {
		log.debug("getting Pedido instance with id: " + id);
		try {
			Pedido instance = entityManager.find(Pedido.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

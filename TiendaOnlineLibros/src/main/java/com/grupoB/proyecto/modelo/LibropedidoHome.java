// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Libropedido.
 * 
 * @see .Libropedido
 * @author Hibernate Tools
 */
@Stateless
public class LibropedidoHome {

	private static final Log log = LogFactory.getLog(LibropedidoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Libropedido transientInstance) {
		log.debug("persisting Libropedido instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Libropedido persistentInstance) {
		log.debug("removing Libropedido instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Libropedido merge(Libropedido detachedInstance) {
		log.debug("merging Libropedido instance");
		try {
			Libropedido result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Libropedido findById(Integer id) {
		log.debug("getting Libropedido instance with id: " + id);
		try {
			Libropedido instance = entityManager.find(Libropedido.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

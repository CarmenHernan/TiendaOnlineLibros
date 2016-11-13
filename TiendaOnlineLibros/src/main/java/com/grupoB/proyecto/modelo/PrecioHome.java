// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Precio.
 * 
 * @see .Precio
 * @author Hibernate Tools
 */
@Stateless
public class PrecioHome {

	private static final Log log = LogFactory.getLog(PrecioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Precio transientInstance) {
		log.debug("persisting Precio instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Precio persistentInstance) {
		log.debug("removing Precio instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Precio merge(Precio detachedInstance) {
		log.debug("merging Precio instance");
		try {
			Precio result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Precio findById(Integer id) {
		log.debug("getting Precio instance with id: " + id);
		try {
			Precio instance = entityManager.find(Precio.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

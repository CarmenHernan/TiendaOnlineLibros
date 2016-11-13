// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Libro.
 * 
 * @see .Libro
 * @author Hibernate Tools
 */
@Stateless
public class LibroHome {

	private static final Log log = LogFactory.getLog(LibroHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Libro transientInstance) {
		log.debug("persisting Libro instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Libro persistentInstance) {
		log.debug("removing Libro instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Libro merge(Libro detachedInstance) {
		log.debug("merging Libro instance");
		try {
			Libro result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Libro findById(Integer id) {
		log.debug("getting Libro instance with id: " + id);
		try {
			Libro instance = entityManager.find(Libro.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

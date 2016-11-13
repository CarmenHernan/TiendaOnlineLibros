// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Autor.
 * 
 * @see .Autor
 * @author Hibernate Tools
 */
@Stateless
public class AutorHome {

	private static final Log log = LogFactory.getLog(AutorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Autor transientInstance) {
		log.debug("persisting Autor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Autor persistentInstance) {
		log.debug("removing Autor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Autor merge(Autor detachedInstance) {
		log.debug("merging Autor instance");
		try {
			Autor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Autor findById(Integer id) {
		log.debug("getting Autor instance with id: " + id);
		try {
			Autor instance = entityManager.find(Autor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

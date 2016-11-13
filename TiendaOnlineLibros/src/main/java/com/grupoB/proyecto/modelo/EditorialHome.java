// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Editorial.
 * 
 * @see .Editorial
 * @author Hibernate Tools
 */
@Stateless
public class EditorialHome {

	private static final Log log = LogFactory.getLog(EditorialHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Editorial transientInstance) {
		log.debug("persisting Editorial instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Editorial persistentInstance) {
		log.debug("removing Editorial instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Editorial merge(Editorial detachedInstance) {
		log.debug("merging Editorial instance");
		try {
			Editorial result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Editorial findById(Integer id) {
		log.debug("getting Editorial instance with id: " + id);
		try {
			Editorial instance = entityManager.find(Editorial.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

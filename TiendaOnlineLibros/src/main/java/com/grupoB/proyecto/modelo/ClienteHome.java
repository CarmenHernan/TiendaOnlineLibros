// default package
// Generated 10-nov-2016 13:42:44 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cliente.
 * 
 * @see .Cliente
 * @author Hibernate Tools
 */
@Stateless
public class ClienteHome {

	private static final Log log = LogFactory.getLog(ClienteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cliente transientInstance) {
		log.debug("persisting Cliente instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cliente persistentInstance) {
		log.debug("removing Cliente instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cliente merge(Cliente detachedInstance) {
		log.debug("merging Cliente instance");
		try {
			Cliente result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cliente findById(Integer id) {
		log.debug("getting Cliente instance with id: " + id);
		try {
			Cliente instance = entityManager.find(Cliente.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

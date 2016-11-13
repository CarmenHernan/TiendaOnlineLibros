package com.grupoB.proyecto.DAO;
import java.util.List;

import com.grupoB.proyecto.modelo.*;
import com.grupoB.proyecto.util.Sesion;
import com.grupoB.proyecto.DAO.*;

public class ImplPrecioDAO implements I_DAO<Precio,Integer> {
	private Sesion sesion;

	public ImplPrecioDAO () {
		sesion=new Sesion();
	}

	public void persist(Precio entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Precio entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Precio findById(Integer id) {
		Precio precio = (Precio) sesion.getCurrentSession().get(Precio.class, id);
		return precio;
	}

	public void delete(Precio entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Precio precio = findById(id);
		delete(precio);
	}

	@SuppressWarnings("unchecked")
	public List<Precio> findAll() {
		List<Precio> precios= (List<Precio>) sesion.getCurrentSession().createQuery("from Precio").list();
		return precios;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Precio> entityList = findAll();
		for (Precio entity : entityList) {
			delete(entity);
		}
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
}

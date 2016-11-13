package com.grupoB.proyecto.DAO;

import java.util.List;

import com.grupoB.proyecto.modelo.*;
import com.grupoB.proyecto.util.Sesion;
import com.grupoB.proyecto.DAO.*;

public class ImplCategoriaDAO implements I_DAO<Categoria,Integer> {
	private Sesion sesion;

	public ImplCategoriaDAO () {
		sesion=new Sesion();
	}

	public void persist(Categoria entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Categoria entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Categoria findById(Integer id) {
		Categoria categoria = (Categoria) sesion.getCurrentSession().get(Categoria.class, id);
		return categoria;
	}

	public void delete(Categoria entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Categoria categoria = findById(id);
		delete(categoria);
	}

	@SuppressWarnings("unchecked")
	public List<Categoria> findAll() {
		List<Categoria> categorias = (List<Categoria>) sesion.getCurrentSession().createQuery("from Categoria").list();
		return categorias;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Categoria> entityList = findAll();
		for (Categoria entity : entityList) {
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

package com.grupoB.proyecto.DAO;
import java.util.List;

import com.grupoB.proyecto.modelo.*;
import com.grupoB.proyecto.util.Sesion;
import com.grupoB.proyecto.DAO.*;

public class ImplLibroPedidoDAO implements I_DAO<Libropedido,Integer> {
	private Sesion sesion;

	public ImplLibroPedidoDAO () {
		sesion=new Sesion();
	}

	public void persist(Libropedido entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Libropedido entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Libropedido findById(Integer id) {
		Libropedido libropedido = (Libropedido) sesion.getCurrentSession().get(Libro.class, id);
		return libropedido;
	}

	public void delete(Libropedido entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Libropedido libropedido = findById(id);
		delete(libropedido);
	}

	@SuppressWarnings("unchecked")
	public List<Libropedido> findAll() {
		List<Libropedido> libropedidos = (List<Libropedido>) sesion.getCurrentSession().createQuery("from Libropedido").list();
		return libropedidos;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Libropedido> entityList = findAll();
		for (Libropedido entity : entityList) {
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
package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplLibroPedidoDAO;
import com.grupoB.proyecto.modelo.Libropedido;
import com.grupoB.proyecto.util.*;


public class LibroPedidoServicio {
	private static ImplLibroPedidoDAO libroPedidoDao;

	public LibroPedidoServicio() {
		libroPedidoDao = new ImplLibroPedidoDAO();
	}

	public void persist(Libropedido libroPedido) {
		libroPedidoDao.getSesion().openCurrentSessionwithTransaction();
		libroPedidoDao.persist(libroPedido);
		libroPedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Libropedido libroPedido) {
		libroPedidoDao.getSesion().openCurrentSessionwithTransaction();
		libroPedidoDao.update(libroPedido);
		libroPedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Libropedido findById(Integer id) {
		libroPedidoDao.getSesion().openCurrentSession();
		Libropedido book = libroPedidoDao.findById(id);
		libroPedidoDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) {
		libroPedidoDao.getSesion().openCurrentSessionwithTransaction();
		Libropedido book = libroPedidoDao.findById(id);
		libroPedidoDao.delete(book);
		libroPedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Libropedido> findAll() {
		libroPedidoDao.getSesion().openCurrentSession();
		List<Libropedido> books = libroPedidoDao.findAll();
		libroPedidoDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() {
		libroPedidoDao.getSesion().openCurrentSessionwithTransaction();
		libroPedidoDao.deleteAll();
		libroPedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplLibroPedidoDAO libroPedidoDao() {
		return libroPedidoDao;
	}
}

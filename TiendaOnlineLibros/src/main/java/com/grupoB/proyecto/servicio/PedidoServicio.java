package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplPedidoDAO;
import com.grupoB.proyecto.modelo.Pedido;

public class PedidoServicio 
{
	private static ImplPedidoDAO pedidoDao;

	public PedidoServicio() 
	{
		pedidoDao = new ImplPedidoDAO();
	}

	public void persist(Pedido pedido) 
	{
		pedidoDao.getSesion().openCurrentSessionwithTransaction();
		pedidoDao.persist(pedido);
		pedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Pedido pedido) 
	{
		pedidoDao.getSesion().openCurrentSessionwithTransaction();
		pedidoDao.update(pedido);
		pedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Pedido findById(Integer id) 
	{
		pedidoDao.getSesion().openCurrentSession();
		Pedido book = pedidoDao.findById(id);
		pedidoDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		pedidoDao.getSesion().openCurrentSessionwithTransaction();
		Pedido book = pedidoDao.findById(id);
		pedidoDao.delete(book);
		pedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Pedido> findAll() 
	{
		pedidoDao.getSesion().openCurrentSession();
		List<Pedido> books = pedidoDao.findAll();
		pedidoDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		pedidoDao.getSesion().openCurrentSessionwithTransaction();
		pedidoDao.deleteAll();
		pedidoDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplPedidoDAO pedidoDao() 
	{
		return pedidoDao;
	}
}

package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplPrecioDAO;
import com.grupoB.proyecto.modelo.Precio;

public class PrecioServicio 
{
	private static ImplPrecioDAO precioDao;

	public PrecioServicio() 
	{
		precioDao = new ImplPrecioDAO();
	}

	public void persist(Precio precio) 
	{
		precioDao.getSesion().openCurrentSessionwithTransaction();
		precioDao.persist(precio);
		precioDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Precio precio) 
	{
		precioDao.getSesion().openCurrentSessionwithTransaction();
		precioDao.update(precio);
		precioDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Precio findById(Integer id) 
	{
		precioDao.getSesion().openCurrentSession();
		Precio book = precioDao.findById(id);
		precioDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		precioDao.getSesion().openCurrentSessionwithTransaction();
		Precio book = precioDao.findById(id);
		precioDao.delete(book);
		precioDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Precio> findAll() 
	{
		precioDao.getSesion().openCurrentSession();
		List<Precio> books = precioDao.findAll();
		precioDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		precioDao.getSesion().openCurrentSessionwithTransaction();
		precioDao.deleteAll();
		precioDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplPrecioDAO precioDao() 
	{
		return precioDao;
	}
}

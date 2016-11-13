package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplLibroDAO;
import com.grupoB.proyecto.modelo.Libro;


public class LibroServicio 
{
	private static ImplLibroDAO libroDao;

	public LibroServicio() 
	{
		libroDao = new ImplLibroDAO();
	}

	public void persist(Libro libro) 
	{
		libroDao.getSesion().openCurrentSessionwithTransaction();
		libroDao.persist(libro);
		libroDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Libro libro) 
	{
		libroDao.getSesion().openCurrentSessionwithTransaction();
		libroDao.update(libro);
		libroDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Libro findById(Integer id) 
	{
		libroDao.getSesion().openCurrentSession();
		Libro book = libroDao.findById(id);
		libroDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		libroDao.getSesion().openCurrentSessionwithTransaction();
		Libro book = libroDao.findById(id);
		libroDao.delete(book);
		libroDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Libro> findAll() 
	{
		libroDao.getSesion().openCurrentSession();
		List<Libro> books = libroDao.findAll();
		libroDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		libroDao.getSesion().openCurrentSessionwithTransaction();
		libroDao.deleteAll();
		libroDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplLibroDAO libroDao() 
	{
		return libroDao;
	}
}

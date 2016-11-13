package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplEditorialDAO;
import com.grupoB.proyecto.modelo.Editorial;

public class EditorialServicio 
{
	private static ImplEditorialDAO editorialDao;

	public EditorialServicio() 
	{
		editorialDao = new ImplEditorialDAO();
	}

	public void persist(Editorial editorial) 
	{
		editorialDao.getSesion().openCurrentSessionwithTransaction();
		editorialDao.persist(editorial);
		editorialDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Editorial editorial) 
	{
		editorialDao.getSesion().openCurrentSessionwithTransaction();
		editorialDao.update(editorial);
		editorialDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Editorial findById(Integer id) 
	{
		editorialDao.getSesion().openCurrentSession();
		Editorial book = editorialDao.findById(id);
		editorialDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		editorialDao.getSesion().openCurrentSessionwithTransaction();
		Editorial book = editorialDao.findById(id);
		editorialDao.delete(book);
		editorialDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Editorial> findAll() 
	{
		editorialDao.getSesion().openCurrentSession();
		List<Editorial> books = editorialDao.findAll();
		editorialDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		editorialDao.getSesion().openCurrentSessionwithTransaction();
		editorialDao.deleteAll();
		editorialDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplEditorialDAO editorialDao() 
	{
		return editorialDao;
	}
}

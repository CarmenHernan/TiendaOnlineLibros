package com.grupoB.proyecto.servicio;

import java.util.List;
import com.grupoB.proyecto.DAO.ImplAutorDAO;
import com.grupoB.proyecto.modelo.Autor;

public class AutorServicio 
{
	private static ImplAutorDAO autorDao;

	public AutorServicio() 
	{
		autorDao = new ImplAutorDAO();
	}

	public void persist(Autor entity) 
	{
		autorDao.getSesion().openCurrentSessionwithTransaction();
		autorDao.persist(entity);
		autorDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Autor entity) 
	{
		autorDao.getSesion().openCurrentSessionwithTransaction();
		autorDao.update(entity);
		autorDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Autor findById(Integer id) 
	{
		autorDao.getSesion().openCurrentSession();
		Autor autor = autorDao.findById(id);
		autorDao.getSesion().closeCurrentSession();
		return autor;
	}

	public void delete(Integer id) 
	{
		autorDao.getSesion().openCurrentSessionwithTransaction();
		Autor autor = autorDao.findById(id);
		autorDao.delete(autor);
		autorDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Autor> findAll() 
	{
		autorDao.getSesion().openCurrentSession();
		List<Autor> autores = autorDao.findAll();
		autorDao.getSesion().closeCurrentSession();
		return autores;
	}

	public void deleteAll() 
	{
		autorDao.getSesion().openCurrentSessionwithTransaction();
		autorDao.deleteAll();
		autorDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplAutorDAO autorDao() 
	{
		return autorDao;
	}
}

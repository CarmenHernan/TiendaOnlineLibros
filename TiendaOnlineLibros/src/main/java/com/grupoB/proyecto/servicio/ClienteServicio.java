package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplClienteDAO;
import com.grupoB.proyecto.modelo.Cliente;

public class ClienteServicio 
{
	private static ImplClienteDAO clienteDao;

	public ClienteServicio() 
	{
		clienteDao = new ImplClienteDAO();
	}

	public void persist(Cliente cliente) 
	{
		clienteDao.getSesion().openCurrentSessionwithTransaction();
		clienteDao.persist(cliente);
		clienteDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Cliente cliente) 
	{
		clienteDao.getSesion().openCurrentSessionwithTransaction();
		clienteDao.update(cliente);
		clienteDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Cliente findById(Integer id) 
	{
		clienteDao.getSesion().openCurrentSession();
		Cliente book = clienteDao.findById(id);
		clienteDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		clienteDao.getSesion().openCurrentSessionwithTransaction();
		Cliente book = clienteDao.findById(id);
		clienteDao.delete(book);
		clienteDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Cliente> findAll() 
	{
		clienteDao.getSesion().openCurrentSession();
		List<Cliente> books = clienteDao.findAll();
		clienteDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		clienteDao.getSesion().openCurrentSessionwithTransaction();
		clienteDao.deleteAll();
		clienteDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplClienteDAO clienteDao() 
	{
		return clienteDao;
	}
}

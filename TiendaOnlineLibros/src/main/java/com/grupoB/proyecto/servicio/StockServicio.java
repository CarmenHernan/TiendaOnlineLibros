package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.ImplStockDAO;
import com.grupoB.proyecto.modelo.Stock;

public class StockServicio 
{
	private static ImplStockDAO stockDao;

	public StockServicio() 
	{
		stockDao = new ImplStockDAO();
	}

	public void persist(Stock stock) 
	{
		stockDao.getSesion().openCurrentSessionwithTransaction();
		stockDao.persist(stock);
		stockDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Stock stock) 
	{
		stockDao.getSesion().openCurrentSessionwithTransaction();
		stockDao.update(stock);
		stockDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Stock findById(Integer id) 
	{
		stockDao.getSesion().openCurrentSession();
		Stock book = stockDao.findById(id);
		stockDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		stockDao.getSesion().openCurrentSessionwithTransaction();
		Stock book = stockDao.findById(id);
		stockDao.delete(book);
		stockDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Stock> findAll() 
	{
		stockDao.getSesion().openCurrentSession();
		List<Stock> books = stockDao.findAll();
		stockDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		stockDao.getSesion().openCurrentSessionwithTransaction();
		stockDao.deleteAll();
		stockDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplStockDAO stockDao() 
	{
		return stockDao;
	}
}

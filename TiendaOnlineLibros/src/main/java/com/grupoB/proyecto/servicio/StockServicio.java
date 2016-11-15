package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplStockDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Stock;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StockServicio 
{
	@Autowired
	private I_DAO<Stock,Integer> stockDao;
	
	
	
	public void persist(Stock entity) {
		stockDao.persist(entity);
	}
		
	public void update(Stock entity) {
		stockDao.update(entity);
	}
    public Stock findById(Integer id) {
    	return stockDao.findById(id);
    }
		
    	
    	
    public void delete(Stock entity) {	
    	stockDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	stockDao.deleteById(id);
    }

    public List<Stock> findAll() {	
    	return stockDao.findAll();
    }
    	
    public void deleteAll() {	
    	stockDao.deleteAll();
    }
	}

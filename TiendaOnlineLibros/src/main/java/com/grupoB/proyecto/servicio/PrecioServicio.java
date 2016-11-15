package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplPrecioDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Precio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PrecioServicio 
{
	@Autowired
	private I_DAO<Precio,Integer> precioDao;
	
	
	
	public void persist(Precio entity) {
		precioDao.persist(entity);
	}
		
	public void update(Precio entity) {
		precioDao.update(entity);
	}
    public Precio findById(Integer id) {
    	return precioDao.findById(id);
    }
		
    	
    	
    public void delete(Precio entity) {	
    	precioDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	precioDao.deleteById(id);
    }

    public List<Precio> findAll() {	
    	return precioDao.findAll();
    }
    	
    public void deleteAll() {	
    	precioDao.deleteAll();
    }
	}

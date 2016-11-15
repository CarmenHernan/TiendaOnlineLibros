package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplEditorialDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Cliente;
import com.grupoB.proyecto.modelo.Editorial;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EditorialServicio 
{
	@Autowired
	private I_DAO<Editorial,Integer> editorialDao;
	
	
	
	public void persist(Editorial entity) {
		editorialDao.persist(entity);
	}
		
	public void update(Editorial entity) {
		editorialDao.update(entity);
	}
    public Editorial findById(Integer id) {
    	return editorialDao.findById(id);
    }
		
    	
    	
    public void delete(Editorial entity) {	
    	editorialDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	editorialDao.deleteById(id);
    }

    public List<Editorial> findAll() {	
    	return editorialDao.findAll();
    }
    	
    public void deleteAll() {	
    	editorialDao.deleteAll();
    }
	}

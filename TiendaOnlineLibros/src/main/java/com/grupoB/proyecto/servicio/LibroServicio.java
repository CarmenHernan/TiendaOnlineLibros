package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplLibroDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Libro;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LibroServicio 
{
	@Autowired
	private I_DAO<Libro,Integer> libroDao;
	
	
	
	public void persist(Libro entity) {
		libroDao.persist(entity);
	}
		
	public void update(Libro entity) {
		libroDao.update(entity);
	}
    public Libro findById(Integer id) {
    	return libroDao.findById(id);
    }
		
    	
    	
    public void delete(Libro entity) {	
    	libroDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	libroDao.deleteById(id);
    }

    public List<Libro> findAll() {	
    	return libroDao.findAll();
    }
    	
    public void deleteAll() {	
    	libroDao.deleteAll();
    }
	}

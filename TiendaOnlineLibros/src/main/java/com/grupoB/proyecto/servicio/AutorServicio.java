package com.grupoB.proyecto.servicio;

import java.util.List;


import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.modelo.Autor;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AutorServicio 
{
	@Autowired
	private I_DAO<Autor,Integer>  autorDao;
	
	
	/* No hace falta poner los constructores, está el vacío por defecto. En caso de ponerlos, tendría que poner ambos.
	
	public CategoriaServicio(){
		
	}
	
	public CategoriaServicio(ImplCategoriaDAO categoriaDao) {
		super();
		this.ImplCategoriaDAO = categoriaDao;
	}
	*/
	public void persist(Autor entity) {
		autorDao.persist(entity);
	}
		
	public void update(Autor entity) {
		autorDao.update(entity);
	}
    public Autor findById(Integer id) {
    	return autorDao.findById(id);
    }
		
    	
    	
    public void delete(Autor entity) {	
    	autorDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	autorDao.deleteById(id);
    }

    public List<Autor> findAll() {	
    	return autorDao.findAll();
    }
    	
    public void deleteAll() {	
    	autorDao.deleteAll();
    }
	}

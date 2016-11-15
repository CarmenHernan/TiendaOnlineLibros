package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplCategoriaDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Categoria;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoriaServicio 
{
	@Autowired
	private I_DAO<Categoria,Integer> categoriaDao;
	
	
	/* No hace falta poner los constructores, está el vacío por defecto. En caso de ponerlos, tendría que poner ambos.
	
	public CategoriaServicio(){
		
	}
	
	public CategoriaServicio(ImplCategoriaDAO categoriaDao) {
		super();
		this.ImplCategoriaDAO = categoriaDao;
	}
	*/
	public void persist(Categoria entity) {
		categoriaDao.persist(entity);
	}
		
	public void update(Categoria entity) {
		categoriaDao.update(entity);
	}
    public Categoria findById(Integer id) {
    	return categoriaDao.findById(id);
    }
		
    	
    	
    public void delete(Categoria entity) {	
    	categoriaDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	categoriaDao.deleteById(id);
    }

    public List<Categoria> findAll() {	
    	return categoriaDao.findAll();
    }
    	
    public void deleteAll() {	
    	categoriaDao.deleteAll();
    }
	}

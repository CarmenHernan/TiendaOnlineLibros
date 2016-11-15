package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplLibroPedidoDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Libropedido;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LibroPedidoServicio 
{
	@Autowired
	private I_DAO<Libropedido,Integer>  libropedidoDao;
	
	
	
	public void persist(Libropedido entity) {
		libropedidoDao.persist(entity);
	}
		
	public void update(Libropedido entity) {
		libropedidoDao.update(entity);
	}
    public Libropedido findById(Integer id) {
    	return libropedidoDao.findById(id);
    }
		
    	
    	
    public void delete(Libropedido entity) {	
    	libropedidoDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	libropedidoDao.deleteById(id);
    }

    public List<Libropedido> findAll() {	
    	return libropedidoDao.findAll();
    }
    	
    public void deleteAll() {	
    	libropedidoDao.deleteAll();
    }
	}

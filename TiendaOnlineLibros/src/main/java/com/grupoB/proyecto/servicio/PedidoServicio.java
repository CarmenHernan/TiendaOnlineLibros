package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplPedidoDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Pedido;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PedidoServicio 
{
	@Autowired
	private I_DAO<Pedido,Integer> pedidoDao;
	
	
	
	public void persist(Pedido entity) {
		pedidoDao.persist(entity);
	}
		
	public void update(Pedido entity) {
		pedidoDao.update(entity);
	}
    public Pedido findById(Integer id) {
    	return pedidoDao.findById(id);
    }
		
    	
    	
    public void delete(Pedido entity) {	
    	pedidoDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	pedidoDao.deleteById(id);
    }

    public List<Pedido> findAll() {	
    	return pedidoDao.findAll();
    }
    	
    public void deleteAll() {	
    	pedidoDao.deleteAll();
    }
	}

package com.grupoB.proyecto.servicio;

import java.util.List;

import com.grupoB.proyecto.DAO.I_DAO;
import com.grupoB.proyecto.DAO.ImplClienteDAO;
import com.grupoB.proyecto.modelo.Autor;
import com.grupoB.proyecto.modelo.Cliente;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClienteServicio 
{
	@Autowired
	private I_DAO<Cliente,Integer>  clienteDao;
	
	
	
	public void persist(Cliente entity) {
		clienteDao.persist(entity);
	}
		
	public void update(Cliente entity) {
		clienteDao.update(entity);
	}
    public Cliente findById(Integer id) {
    	return clienteDao.findById(id);
    }
		
    	
    	
    public void delete(Cliente entity) {	
    	clienteDao.delete(entity);
    }
    	
    public void deleteById(Integer id) {
    	clienteDao.deleteById(id);
    }

    public List<Cliente> findAll() {	
    	return clienteDao.findAll();
    }
    	
    public void deleteAll() {	
    	clienteDao.deleteAll();
    }
	}

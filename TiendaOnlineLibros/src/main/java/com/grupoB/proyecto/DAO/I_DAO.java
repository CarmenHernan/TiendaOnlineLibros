
package com.grupoB.proyecto.DAO;

import java.io.Serializable;
import java.util.List;

public interface I_DAO<T, Id extends Serializable> {



	// CREATE
	public void persist(T entity);

	// READ
	public T findById(Id id);

	public List<T> findAll();

	// UPDATE
	public void update(T entity);
	// actualiza

	// DELETE
	public void delete(T entity);

	public void deleteById(Id id);

	public void deleteAll();

}




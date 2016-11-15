// default package
// Generated 10-nov-2016 13:42:43 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Autor generated by hbm2java
 */

@Entity
@Table(name = "autor", catalog = "tiendaonlinefinal4")

public class Autor implements java.io.Serializable {

	@Size(max=15)
	@NotNull
	private Integer idAutor;
	
	@Size(max=15)
	@NotNull
	private Libro libro;
	
	@Size(max=45)
	@NotNull
	private String nombre;

	public Autor() {
	}

	public Autor(Libro libro, String nombre) {
		this.libro = libro;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAutor", unique = true, nullable = false)
	public Integer getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro", nullable = false)
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", libro=" + libro + ", nombre=" + nombre + "]";
	}*/

}

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Precio generated by hbm2java
 */
@Entity
@Table(name = "precio", catalog = "tiendaonlinefinal4")
public class Precio implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	@Size(max=15)
	@NotNull
	private Integer idPrecio;
	@Size(max=15)
	@NotNull
	private Libro libro;
	@Size(max=15)
	private Float precio;

	public Precio() {
	}

	public Precio(Libro libro) {
		this.libro = libro;
	}

	public Precio(Libro libro, Float precio) {
		this.libro = libro;
		this.precio = precio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idPrecio", unique = true, nullable = false)
	public Integer getIdPrecio() {
		return this.idPrecio;
	}

	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro", nullable = false)
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Column(name = "precio", precision = 12, scale = 0)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	/*
	@Override
	public String toString() {
		return "Precio [idPrecio=" + idPrecio + ", libro=" + libro + ", precio=" + precio + "]";
	}*/

}

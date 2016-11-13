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

/**
 * Libropedido generated by hbm2java
 */
@Entity
@Table(name = "libropedido", catalog = "tiendaonlinefinal3")
public class Libropedido implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idLibroPedido;
	private Libro libro;
	private Pedido pedido;
	private Integer cantidad;

	public Libropedido() {
	}

	public Libropedido(Libro libro, Pedido pedido) {
		this.libro = libro;
		this.pedido = pedido;
	}

	public Libropedido(Libro libro, Pedido pedido, Integer cantidad) {
		this.libro = libro;
		this.pedido = pedido;
		this.cantidad = cantidad;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLibroPedido", unique = true, nullable = false)
	public Integer getIdLibroPedido() {
		return this.idLibroPedido;
	}

	public void setIdLibroPedido(Integer idLibroPedido) {
		this.idLibroPedido = idLibroPedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro", nullable = false)
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/*
	@Override
	public String toString() {
		return "Libropedido [idLibroPedido=" + idLibroPedido + ", libro=" + libro + ", pedido=" + pedido + ", cantidad="
				+ cantidad + "]";
	}*/

}

// default package
// Generated 10-nov-2016 13:42:43 by Hibernate Tools 4.0.0.Final
package com.grupoB.proyecto.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "tiendaonlinefinal4")
public class Cliente implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	@Size(max=15)
	@NotNull
	private Integer idCliente;
	@Size(max=45)
	@NotNull
	private String nombre;
	@Size(max=45)
	@NotNull
	private String apellido1;
	
	@Size(max=45)
	private String apellido2;
	@Size(max=45)
	@NotNull
	private String direccion;
	@Size(max=45)
	@NotNull
	private String ciudad;
	@Size(max=45)
	@NotNull
	private String provincia;
	@Size(max=45)
	@NotNull
	private String pais;
	@Size(max=10)
	@NotNull
	private int codigoPostal;
	@Size(max=45)
	@NotNull @Email
	private String email;
	@Size(max=12)
	@NotNull
	private int telefono1;
	@Size(max=12)
	private Integer telefono2;
	@Size(max=45)
	@NotNull
	private String password;
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Past @NotNull
	private Date fechaNacimiento;
	@Size(max=15)
	private Integer idPedido;
	@Size(max=4)
	@NotNull
	private int administrador;
	@NotEmpty
	private Set <Pedido> pedidos = new HashSet<Pedido>();

	public Cliente() {
	}

	public Cliente(String nombre, String apellido1, String direccion, String ciudad, String provincia, String pais,
			int codigoPostal, String email, int telefono1, String password, int administrador) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.telefono1 = telefono1;
		this.password = password;
		this.administrador=administrador;
	}

	public Cliente(String nombre, String apellido1, String apellido2, String direccion, String ciudad, String provincia,
			String pais, int codigoPostal, String email, int telefono1, Integer telefono2, String password,
			Date fechaNacimiento, Integer idPedido, Set<Pedido> pedidos,int administrador) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.idPedido = idPedido;
		this.pedidos = pedidos;
		this.administrador=administrador;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCliente", unique = true, nullable = false)
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name = "administrador", nullable = false)
	public int getAdministrador() {
		return this.administrador;
	}
		
	public void setAdministrador(int administrador) {
			this.administrador = administrador;
		}
		
		
		

	@Column(name = "apellido1", nullable = false, length = 45)
	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "apellido2", length = 45)
	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "direccion", nullable = false, length = 45)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "ciudad", nullable = false, length = 45)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "provincia", nullable = false, length = 45)
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Column(name = "pais", nullable = false, length = 45)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "codigoPostal", nullable = false)
	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telefono1", nullable = false)
	public int getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(int telefono1) {
		this.telefono1 = telefono1;
	}

	@Column(name = "telefono2")
	public Integer getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(Integer telefono2) {
		this.telefono2 = telefono2;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "idPedido")
	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	/*
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais="
				+ pais + ", codigoPostal=" + codigoPostal + ", email=" + email + ", telefono1=" + telefono1
				+ ", telefono2=" + telefono2 + ", password=" + password + ", fechaNacimiento=" + fechaNacimiento
				+ ", idPedido=" + idPedido + ", administrador=" + administrador + ", pedidos=" + pedidos + "]";
	}*/

}
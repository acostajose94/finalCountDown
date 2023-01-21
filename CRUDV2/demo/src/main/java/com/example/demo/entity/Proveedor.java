package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;


@Entity
@Table(name="proveedor")

public class Proveedor  implements Serializable {

	/**
	 *
	 */
	private static Long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String ruc;
	@NotEmpty
	private String razonsocial;
	@NotEmpty
	private String direccion;
	@NotEmpty
	private String distrito;
	@NotEmpty
	private String telefono;
	@NotEmpty
	@Email
	private String correo;
	@NotEmpty
	private String paginaweb;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPaginaweb() {
		return paginaweb;
	}

	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}

	@Override
	public String toString() {
		return "Proveedor[id=" + id + ", ruc=" + ruc  +
				", razonsocial=" + razonsocial +
				", direccion=" + direccion +
				", distrito=" + distrito +
				", telefono=" + telefono +
				", correo=" + correo +
				", paginaweb=" + paginaweb +
				"}";
	}
}


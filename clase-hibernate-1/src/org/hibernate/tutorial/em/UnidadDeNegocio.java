package org.hibernate.tutorial.em;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UnidadDeNegocio {

	@Id
	@GeneratedValue
	private String codigo;
	
	private String nombre;

	public UnidadDeNegocio(String codigo, String nombre) {

		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

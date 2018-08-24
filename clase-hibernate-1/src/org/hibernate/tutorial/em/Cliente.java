package org.hibernate.tutorial.em;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class Cliente {
	
	@Id
	private long id;
	
	@NaturalId	
	private String cuit;
	
	private String nombre;

	public Cliente(String cuit, String nombre) {

		this.cuit = cuit;
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

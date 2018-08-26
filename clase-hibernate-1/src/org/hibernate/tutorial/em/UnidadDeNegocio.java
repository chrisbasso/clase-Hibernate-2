package org.hibernate.tutorial.em;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NaturalId;

@Entity
public class UnidadDeNegocio {

	@Id
	@GeneratedValue
	private long id;

	@NaturalId
	private String codigo;

	private String nombre;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Departamento> departamento;

	public UnidadDeNegocio(String codigo, String nombre, List<Departamento> departamento) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.departamento = departamento;
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

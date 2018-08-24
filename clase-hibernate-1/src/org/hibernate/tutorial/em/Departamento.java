package org.hibernate.tutorial.em;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {

	@Id
	@GeneratedValue
	private String codigo;
	
	private String nombre;
	
	@OneToMany(mappedBy="departamento")
	private List<Empleado> empleados = new ArrayList<Empleado>();


	public Departamento(String codigo, String nombre) {

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

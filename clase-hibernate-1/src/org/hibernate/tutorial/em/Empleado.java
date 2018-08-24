package org.hibernate.tutorial.em;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

@Entity
public class Empleado {

	@Id
	@GeneratedValue
	private long id;
	
	@NaturalId
	private int legajo;
	
	private String nombre;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Departamento departamento;
	
	@ManyToMany(mappedBy = "empleados", cascade = CascadeType.ALL)
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();


	
	public Empleado(int legajo, String nombre, Departamento departamento, List<Proyecto> proyectos) {
	
		this.legajo = legajo;
		this.nombre = nombre;
		this.departamento = departamento;
		this.proyectos = proyectos;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

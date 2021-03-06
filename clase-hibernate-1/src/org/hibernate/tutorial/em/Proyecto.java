package org.hibernate.tutorial.em;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Proyecto {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;
	private Date fechaFin;

	@ManyToMany(mappedBy = "proyectos", cascade = CascadeType.ALL)
	private List<Empleado> empleados = new ArrayList<Empleado>();

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	public Proyecto(String nombre, Date fechaFin, List<Empleado> empleados, Cliente cliente) {

		this.nombre = nombre;
		this.fechaFin = fechaFin;
		this.empleados = empleados;
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}

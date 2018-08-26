package org.hibernate.tutorial.em;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProyectoOffShore extends Proyecto {

	@Id
	@GeneratedValue
	private long id;
	
	private String pais;
	private String frontOffice;

	

	public ProyectoOffShore(String nombre, Date fechaFin, List<Empleado> empleados, long id, String pais,
			String frontOffice, Cliente cliente) {
		super(nombre, fechaFin, empleados, cliente);
		this.id = id;
		this.pais = pais;
		this.frontOffice = frontOffice;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFrontOffice() {
		return frontOffice;
	}

	public void setFrontOffice(String frontOffice) {
		this.frontOffice = frontOffice;
	}

}

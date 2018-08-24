package org.hibernate.tutorial.em;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class ProyectoLocal extends Proyecto {

	private String provincia;
	private int cantRecursosEnCliente;

	public ProyectoLocal(String nombre, Date fechaFin, String provincia,
			int cantRecursosEnCliente) {
		super(nombre, fechaFin);
		this.provincia = provincia;
		this.cantRecursosEnCliente = cantRecursosEnCliente;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCantRecursosEnCliente() {
		return cantRecursosEnCliente;
	}

	public void setCantRecursosEnCliente(int cantRecursosEnCliente) {
		this.cantRecursosEnCliente = cantRecursosEnCliente;
	}

}

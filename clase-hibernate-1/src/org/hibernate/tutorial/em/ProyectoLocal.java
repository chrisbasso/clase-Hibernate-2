package org.hibernate.tutorial.em;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProyectoLocal extends Proyecto {

	@Id
	@GeneratedValue
	private long id;
	
	private String provincia;
	private int cantRecursosEnCliente;

	

	public ProyectoLocal(String nombre, Date fechaFin, List<Empleado> empleados, long id, String provincia,
			int cantRecursosEnCliente, Cliente cliente) {
		super(nombre, fechaFin, empleados, cliente);
		this.id = id;
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

package org.hibernate.tutorial.em;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class ProyectoOffShore extends Proyecto {

	private String pais;
	private String frontOffice;

	public ProyectoOffShore(String nombre, Date fechaFin, String pais,
			String frontOffice) {
		super(nombre, fechaFin);
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

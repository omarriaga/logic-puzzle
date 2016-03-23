package com.sample;

public class Pista {

	private String descripcion;
	private boolean status;

	public Pista (String descripcion){
		this.descripcion = descripcion;
		this.status = true;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

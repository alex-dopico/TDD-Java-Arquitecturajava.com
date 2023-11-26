package com.acestudios.escuela;

public class Nota {
	private String asignatura;
	private double valor;
	
	public Nota(String asignatura, double valor) {
		super();
		this.asignatura = asignatura;
		this.valor = valor;
	}
	
	public Nota() {
		super();
	}
	
	public String getAsignatura() {
		return this.asignatura;
	}
	
	public void setAsignatura(String nuevaAsignatura) {
		this.asignatura = nuevaAsignatura;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double nuevoValor) {
		this.valor = nuevoValor;
	}
	
	public boolean esMismaAsignatura(Nota otraNota) {
		if (this.getAsignatura().equals(otraNota.getAsignatura())) {
			return true;
		} else {
			return false;
		}
	}
}

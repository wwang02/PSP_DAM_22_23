package Ejercicio4;

import java.util.Scanner;

public abstract class Llamadas {

	private String origen, destino;
	protected int segundos;
	private double coste;
	
	public abstract double calcularCoste();
	
	public Llamadas() {}
	
	public Llamadas(String origen, String destino, int segundos, double coste) {
		this.origen = origen;
		this.destino = destino;
		this.segundos = segundos;
		this.coste = coste;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	
}

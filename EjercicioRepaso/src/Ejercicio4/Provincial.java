package Ejercicio4;

import java.util.Date;

public class Provincial extends Llamadas{
	
	private int hora;
	
	
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Provincial() {

	}

	public Provincial(String origen, String destino, int segundos, double coste) {
		super(origen, destino, segundos, coste);
		super.setOrigen(origen);
		super.setDestino(destino);
		super.segundos = segundos;
		super.setCoste(coste);
	}

	@Override
	public double calcularCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
	
	
	
	
}

package Ejercicio4;

public class Local extends Llamadas{
	
	private static final double precio = 0.15;
	
	public Local() {}

	public Local(String origen, String destino, int segundos, double coste) {
		super(origen, destino, segundos, coste);
		super.setOrigen(origen);
		super.setDestino(destino);
		super.segundos = segundos;
		super.setCoste(coste);
	}
	
	public double calcularCoste() {
		return precio*segundos;
	}
	
	}
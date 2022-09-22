package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Llamadas> llamada= new ArrayList<Llamadas>();
		
		int opt;
		do {
			System.out.println("Si desea añadir llamadas pulse 1.");
			System.out.println("Si desea dejar de añadir llamadas pulse 0.");
			opt = teclado.nextInt();
			
			if(opt == 1) {
				 
				System.out.print("Introduzca el origen de la llamada, (si el local o provincial): ");
				String origen = teclado.next();
				
				System.out.print("Introduzca el destino de la llamada, (si el local o provincial): ");
				String destino = teclado.next();
				
				System.out.print("Introduzca los segundos de llamadas: ");
				int segundos = teclado.nextInt();
				
				System.out.print("Introduzca la llamada si es local o provincial: ");
				String tipo = teclado.next();
				
				if(tipo.equalsIgnoreCase("local")) {
					llamada.add(new Local(origen, destino, segundos, 0.15));
				}
				else if (tipo.equalsIgnoreCase("provincial")) {
					llamada.add(new Provincial(origen, destino, segundos, 0.20));
				}
			}
			
			
		}while(opt!=0);
		
	}

}

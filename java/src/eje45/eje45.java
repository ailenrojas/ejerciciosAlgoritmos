package eje45;

import java.util.Scanner;

public class eje45 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int[] socios = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] nombres = {"Enrique","Liliana","Lucas","Juan" ,"Fiorella", "Ariel", "Daiana"};
		
		System.out.println("ingresa un numero de socio a buscar: ");
		int num_socio_buscado = entrada.nextInt();
		
		boolean busqueda = false;
		// busqueda arranca en false, porque cambia a true si se encuentra un socio
		for (int i = 0; i < socios.length; i++) {
			
			if (num_socio_buscado == socios[i] ) {
				System.out.println("El numero de socio pertenece a : "+nombres[i]);
				busqueda = true;
				// busqueda cambia a true porque se encontro un socio
				break;
			}
			
		}
		
		// con este codigo solo muestro la frase de la linea 30 si no se encontro un socio.
		if (busqueda == false ) {
			System.out.println("No existe ese numero de socio");
		}
		
	}
}
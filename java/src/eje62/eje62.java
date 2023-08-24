package eje62;

import java.util.Scanner;

public class eje62 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		String[] apellidos = new String [5];

		String cadenaMax = "{";
		String cadenaMin = "";

		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese apellidos : ");
			apellidos[i] = entrada.next();

			// comparar para encontrar el maximo
			if (apellidos[i].compareTo(cadenaMax) > 0) {
				cadenaMax = apellidos[i];
			}

			else if (apellidos[i].compareTo(cadenaMin) > 0) {
				cadenaMin = apellidos[i];
			}
		}

	}
}

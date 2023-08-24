package eje42;

import java.util.Scanner;

public class eje42 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[3];

		int numeroAleatorio = (int) (Math.random() * 50);

		// for para ingresar numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("ingrese un numero: ");
			numeros[i] = entrada.nextInt();
		}
		
		// otro for parar recorrer el array "numeros[]" y analizar el resultado

		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] != numeroAleatorio) {
				System.out.println("el numero es incorrecto");
			}
			if (numeros[i] == numeroAleatorio) {
				System.out.println("el numero elegido es correctoo");
				break;
			}
		}
		
		System.out.println("el numero aleatorio es: "+numeroAleatorio);
	}

}

package eje58;

import java.util.Scanner;

public class eje58 {

	static int n1;

	public static void saludar() {
		System.out.println("hola quiero saber si el numero es positivo o negativo ");
	}
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un numero: ");
	    n1 = entrada.nextInt();
	}

	public static boolean esPositivo(int a) {
		// booleano: dos valores. True o false.
		
		boolean positiv = false;
		
		if (a>0) {
			positiv = true;
		}
		
		return positiv;
		
	}
	
	public static void main(String[] args) {
		ingresarNumeros();
		System.out.println("El numero es positivo?: "+esPositivo(n1));
	}
}

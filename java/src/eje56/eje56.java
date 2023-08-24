package eje56;

import java.util.Scanner;

public class eje56 {
	static int n1, n2;
	static String nombre, apellido;
	
	public static void saludar() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Hola.. por favor ingrese su nombre y apellido ");
	    nombre = entrada.next();
	    apellido = entrada.next();
	}

	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un numero: ");
	    n1 = entrada.nextInt();
	    System.out.println("Ingrese el segundo numero: ");
	    n2 = entrada.nextInt();
	  
	}
	public static int dividir1(int a, int b) { // parámetros: a y b.
	    int dividir = a + b * 100;
	    return dividir;
	}
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    saludar();
	    ingresarNumeros();
	 dividir1(n1, n2 ); //n1 y n2: argumentos
	    System.out.println("El resultado de la division es: "  + dividir1(n1, n2 ));
	    
	}
		
	
	}




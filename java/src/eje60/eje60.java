package eje60;

import java.util.Scanner;

public class eje60 {
	
static int cantNotas;
static int[] almacenarNotas;	

	public static void ingresarcuantosNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("cuantas notas : ");
	    cantNotas= entrada.nextFloat();
	}
	
	public static int[] calificaciones(int n) {
		Scanner entrada = new Scanner (System.in);
		almacenarNotas = new int[n];
		
		for(int i = 0; i<n ;i++ ) {
		System.out.println("Ingresa una calificacion: ");
		almacenarNotas[i] = entrada.nextInt();
		}
		return almacenarNotas;
	}

	public static String[] apellidos(int n) {
		
		
		return;
	}

	
	public static void main (String[] args) {
		ingresarcuantosNumeros();
		calificaciones(cantNontas);
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

package eje57;

import java.util.Scanner;

public class eje57 {

	static float n1;
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un numero: ");
	    n1 = entrada.nextFloat();
	}
	
	public static float parteFlotante (float a) {
		float decimal;
		int parteEntera;
		
		parteEntera = (int) a;		
		
		// 4,32. Quiero ver 0,32. Tengo que hacer 4,32 - 4.
		
		decimal = a - parteEntera;
		
		return decimal;
	}
	
	
	
}

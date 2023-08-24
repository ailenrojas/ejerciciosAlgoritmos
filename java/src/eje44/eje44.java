package eje44;

import java.util.Scanner;

public class eje44 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int[] dni = { 4545 , 2124 , 5554 , 1257 };
		
	for (int i = 0; i < dni.length; i++) {
						// Aca nos fijamos si es impar (si es par, %2==0)
			if (dni[i]%2 == 1) {
				System.out.println("el dni elegido no es par ");
				continue;
			}
			
			System.out.println("el dni es par, y es: "+dni[i]);
		}
		
	
}
}
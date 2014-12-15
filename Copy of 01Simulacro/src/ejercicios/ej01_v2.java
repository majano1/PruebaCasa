package ejercicios;

import java.util.Scanner;

public class ej01_v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números a leer:");
		int n = teclado.nextInt();
		int negativo = 0;
		int positivo = 0;
		int num;
		int total = 0;
		double media = 0;
		
		System.out.println("Introduce "+n+" números:");
		for (int i = 1; i <= n; i++) {
			
			num = teclado.nextInt();
			if (num < 0) {
				negativo++;
			}

			if (num > 0) {
				positivo++;
			}
			
			media +=num;

		}
	 System.out.println("Negativos: "+negativo);
	 System.out.println("Positivos: "+positivo);
	 
	 System.out.println("Media: "+(media/n));
	 
	}

}

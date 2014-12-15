package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[40];
		int num = 0;

		System.out.println("Introduce los números a leer:");

		for (int i = 1; i <= 40; i++) {
			num = teclado.nextInt();
			numeros[i] = num;

			if (numeros[i] == 0) {
				Arrays.sort(numeros);
				if (numeros[i-1]==numeros[i]) {
					System.out.println("Hay repetidos");
				} else {
					System.out.println("No hay repetidos");
				}
				break;
			}
		}
}
	
}

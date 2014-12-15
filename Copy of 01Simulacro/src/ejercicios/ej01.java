package ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad de números a leer:");
		int n=teclado.nextInt();
		
		int [] numeros=new int[n];
		
		System.out.println("Introduce "+n+" números:");
		
		for (int i=0;i<n;i++) {
		
		int num=teclado.nextInt();
		numeros[i]=num;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println("\n");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]<0) { 
				System.out.println("Negativos: "+numeros[i]);
			}
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>0) { 
				System.out.println("Positivos: "+numeros[i]);
			}
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
	}

}

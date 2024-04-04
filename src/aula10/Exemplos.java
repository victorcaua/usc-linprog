package aula10;

public class Exemplos {

	public static void main(String[] args) {
		// Declaração de arrays 
		int[] a = new int [4];
		
		char[] b;
		b = new char[10];
		
		int[] c = {12,32,54,6,8,89,64,64,6};
		
		// Manipulação de array
		int[] num = new int[5];
		num[0] = 5;
		num[3] = 4;
		
		int valor1 = num[0];
		System.out.println(num[3]);
		
		// Percorrendo arrays
		int[] numeros = {10,20,30,40,50};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}


	}

}

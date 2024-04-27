package aula09;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o nome de uma cidade");
			String cidade = scan.next();
			
			if (cidade.equalsIgnoreCase("Curitiba")) {
				System.out.println("Curitiba :)");
			}
			else {
				System.out.println("Outra cidade");
			}
			scan.close();

	}

}

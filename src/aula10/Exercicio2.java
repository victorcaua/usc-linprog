package aula10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] alunos = new String[3];
		double[] notas1B = new double[3];
		double[] notas2B = new double[3];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome do " + (i +1) + " aluno");
			alunos[i] = scan.nextLine();
			
			System.out.println("Digite a nota do 1B do aluno " + alunos[i]);
			notas1B[i] = scan.nextDouble();
			
			System.out.println("Digite a nota do 2B do aluno " + alunos[i]);
			notas2B[i] = scan.nextDouble();
			
			scan.nextLine();
		}
		
		for (int i = 0; i < alunos.length; i++) {
            double media = (notas1B[i] + notas2B[i]) / 2.0;
            System.out.println("Média de " + alunos[i] + ": " + media);
        }
        
        scan.close();
		

	}

}

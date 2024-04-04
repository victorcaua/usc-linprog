package aula09;

public class Exercicio1 {

	public static void main(String[] args) {
		String nomeCompleto = "Victor Cauã Pinto de Aguiar";
		String[] nomeArray = nomeCompleto.split(" ");
		System.out.println("Nome completo: " + nomeCompleto + 
						   "\nPrimeiro nome: " + nomeArray[0]);
	}

}

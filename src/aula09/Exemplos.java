package aula09;

public class Exemplos {
	public static void main(String[] args) {
		//Introdução 1.2
		String stringLiteral = "Minha string";
		
		//Introdução 1.3
		char[] caracteres = {'M', 'i', 'n', 'h', 'a', ' '
							, 'S', 't', 'r', 'i', 'n', 'g'};
		String stringArray = new String(caracteres);
		String outraString = new String("Isso é outra string");
		
		//Exemplo 1 - String imutabilidade
		String original = "Hello";
		String strConcatenada = original + " World";
		String strMaiuscula = original.toUpperCase();
		System.out.println("String original: " + original +
						   "\nString concatenada: " + strConcatenada +
						   "\nString maiscula: " + strMaiuscula +
						   "\nString original apos modificar: " + original);
		
		//Métodos de String
		//1 - Obter tamanho String
		String minhaString = "Exemplo de String";
		int tamanhoString = minhaString.length();
		
		//2 - Acesso a caracteres individuais
		char primeiroChar = minhaString.charAt(0);
		char terceiroChar = minhaString.charAt(2);
		
		//3 - Pesquisa e substituição
		//indexOf()
		int indice = minhaString.indexOf("String");
		int indice2 = minhaString.indexOf("Java");
		
		//replace()
		String minhaString2 = "Substitui 'a' por 'X'";
		String novaString = minhaString2.replace("a", "X");
		
		//4 - Conversão de maiuscula e minuscula 
		String emMaiuscula = minhaString.toUpperCase();
		String emMinuscula = minhaString.toLowerCase();
		
		//5 - Quebra de strings em partes
		String minhaString3 = "Maca,  Banana, Cereja, Damasco";
		String[] partes = minhaString3.split(",");
		
		for (String parte : partes) {
			System.out.println(parte);
		}
		
		//Utilizando substring()
		String texto = "Exemplo de substring";
		String sub = texto.substring(8, 15);
		
		//6 - Comparação de String
		//equals()
		String strl = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		boolean saolguaisl = strl.equals(str2);
		boolean saoIlguais2 = strl.equals(str3); 
		
		//equalsIgnoreCase()
		String str4 = "Hello";
		String str5 = "hello";
		boolean saolguais = str4.equalsIgnoreCase(str2);
		
		//starsWith() e endsWith()
		String minhaString4 = "Ola, mundo";
		boolean comecaComOla = minhaString4.startsWith("Ola");
		boolean terminaComMundo = minhaString4.endsWith("Mundo");
		
		//7 - Formatação de strings
		//Substituição de valores em uma String
		String nome = "Alice";
		int idade = 30;
		String mensagem = String.format(" Ola, meu nome e %s e eu tenho %d anos", nome, idade);
		
		//Formatação de números decimais
		double valor = 123.456789;
		String valorFormatado = String.format("O valor e %.2f", valor);
		
		//Remover espaços em branco de uma String
		String texto1 = "    Espacos  em branco no inicio e no final    ";
		String textoTrimmed = texto1.trim();
		
		//8 - Uso de operadores com String
		String saudacao = "Ola, ";
		String nome1 = "Alice";
		String mensagem1 = saudacao + nome1;
		System . out . println (mensagem1); 
		
		//9 - Percorrendo os caracteres de uma String
		String minhaString1 = "Exemplo de String";
		for (int i = 0; i < minhaString1.length(); i++) {
			char caractere = minhaString1.charAt(i);
			System.out.print(caractere + " ");
		}
		
		for (char caractere : minhaString1.toCharArray()) {
			System.out.print(caractere + " ");
		}

		}
}

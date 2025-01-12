package ados.ado5;

import java.util.Scanner;

public class MultiplaEscolha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("C.C - Referente a convers�o de bin�rio para decimal, assinale a alternativa correta:");
		System.out.println("a) Deve ser dividido e multiplicado pela potencia para chegar ao resultado");
		System.out.println(
				"b) A base deve ser multiplicada pela potencia correspondente e a soma deve ser feita com o resultado da multiplica��o");
		System.out.println(
				"c) A base deve ser dividida pela potencia e o quivalente multiplicado para chegar ao resultadp");
		System.out.println(
				"d) A base deve ser multiplicada pela potencia correspondente, multiplicar o resultado das potencias e soma deve ser feita com o equivalente");
		System.out.println("e) Deve ser somado pela potencia e o resultado multiplicado");

		char alternativa;

		int tentativa = 0;

		do {
			if (tentativa < 1) {
				System.out.println("Digite uma alternativa: ");
			} else {
				System.out.println("Tente novamente!");
			}

			alternativa = sc.next().charAt(0);

			switch (alternativa) {
			
			case 'b':
			case 'B':
				System.out.println("Resposta correta!");
				break;
			case 'a':
			case 'A':
			case 'c':
			case 'C':
			case 'd':
			case 'D':
			case 'e':
			case 'E':
				System.out.printf("Resposta incorreta! ");
				break;

			default:
				System.out.println("Escolha inv�lida!");
			}

			tentativa++;

		} while (alternativa != 'b' && tentativa < 3);

		if (alternativa != 'b') {
			System.out.println("N�mero de tentativas excedidas");
		} else {
			System.out.println("Acertou ma tentativa: " + tentativa);
		}

	}
}

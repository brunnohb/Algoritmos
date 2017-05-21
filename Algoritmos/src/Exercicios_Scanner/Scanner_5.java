package Exercicios_Scanner;

/*5.	Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 * Imprima no console true se o resultado do primeiro número menos 
 * o segundo número é maior que 0 e false caso for menor igual a 0. */

import java.util.Scanner;

public class Scanner_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n3 = 0;

		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro número: ");
		n2 = scanner.nextInt();

		n3 = n1 - n2;

		if (n3 > 0) {
			System.out.println("True");

		} else {
			System.out.println("False");

			scanner.close();
		}
	}
}
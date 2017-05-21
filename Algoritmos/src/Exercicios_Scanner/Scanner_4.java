package Exercicios_Scanner;

/*4.	Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número é maior que o segundo número digitado.*/

import java.util.Scanner;

public class Scanner_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro número: ");
		n2 = scanner.nextInt();

		if (n1 > n2) {
			System.out.println("True");
		} else {
			System.out.println("False");

			scanner.close();
		}
	}
}

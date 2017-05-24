package Exercicios_Scanner;

/*10.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 Imprima no console o valor do resultado do primeiro número elevado ao quadrado 
 mais o segundo número elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro numero: ");
		n2 = scanner.nextInt();

		scanner.close();

		System.out.println((n1 * n1) + (n2 * n2));

	}

}

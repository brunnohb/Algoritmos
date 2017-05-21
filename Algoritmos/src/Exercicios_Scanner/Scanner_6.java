package Exercicios_Scanner;

/*6.	Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. Imprima no console o resultado da divisão dos dois números.*/

import java.util.Scanner;

public class Scanner_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro número: ");
		n2 = scanner.nextInt();

		System.out.println(n1 / n2);

		scanner.close();
	}

}

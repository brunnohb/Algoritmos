package Exercicios_Scanner;

/*1.	Escreva no console para digitar um n�mero inteiro,
leia o n�mero inteiro digitado e imprima o n�mero no console.*/

import java.util.Scanner;

public class Scanner_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um n�mero inteiro: ");
		n1 = scanner.nextInt();
		System.out.println(n1);
		scanner.close();

	}
}

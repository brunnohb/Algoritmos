package Exercicios_Scanner;

/*7.	Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console true se o resultado da divis�o dos dois n�mero � par, 
 * e false caso o resultado da divis�o seja �mpar.*/

import java.util.Scanner;

public class Scanner_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n3 = 0;

		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro n�mero: ");
		n2 = scanner.nextInt();

		n3 = n1 / n2;
		if (n3 % 2 == 0) {
			System.out.println("False");
		} else {
			System.out.println("True");

			scanner.close();
		}
	}
}

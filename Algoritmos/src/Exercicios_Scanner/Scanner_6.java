package Exercicios_Scanner;

/*6.	Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. Imprima no console o resultado da divis�o dos dois n�meros.*/

import java.util.Scanner;

public class Scanner_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro n�mero: ");
		n2 = scanner.nextInt();

		System.out.println(n1 / n2);

		scanner.close();
	}

}

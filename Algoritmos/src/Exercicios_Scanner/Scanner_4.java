package Exercicios_Scanner;

/*4.	Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.*/

import java.util.Scanner;

public class Scanner_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro n�mero: ");
		n2 = scanner.nextInt();

		if (n1 > n2) {
			System.out.println("True");
		} else {
			System.out.println("False");

			scanner.close();
		}
	}
}

package Exercicios_Scanner;

/*8.	Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 Imprima no console true se o primeiro número digitado é maior que 5 e o segundo número menor que 10. 
 Caso contrário imprima false.*/

import java.util.Scanner;

public class Scanner_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um número inteiro: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro número: ");
		n2 = scanner.nextInt();

		if (n1 > 5 & n2 < 10) {
			System.out.println("True");
		} else {
			System.out.println("False");

			scanner.close();
		}
	}
}

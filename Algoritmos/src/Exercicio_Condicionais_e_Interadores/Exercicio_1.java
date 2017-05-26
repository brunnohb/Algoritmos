package Exercicio_Condicionais_e_Interadores;
/*1.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior 
 * que 10”, caso contrário imprima “o valor digitado é menor que 10”.*/

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();

		if (n1 > 10) {
			System.out.println("O valor digitado é maior que 10");
		} else {
			System.out.println("O valor digitado é menor que 10");
		}

	}

}

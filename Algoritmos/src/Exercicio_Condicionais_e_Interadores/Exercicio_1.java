package Exercicio_Condicionais_e_Interadores;
/*1.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
 * Verifique se o n�mero � maior que 10, caso sim, imprima �o valor digitado � maior 
 * que 10�, caso contr�rio imprima �o valor digitado � menor que 10�.*/

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();

		if (n1 > 10) {
			System.out.println("O valor digitado � maior que 10");
		} else {
			System.out.println("O valor digitado � menor que 10");
		}

	}

}

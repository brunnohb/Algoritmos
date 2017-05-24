package Exercicios_Scanner;

/*12.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * 
 * a.	Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo terceiro número mais,
 *  o resultado somando com o segundo número elevado ao cubo). 
 *  
 *  b.	Imprima true se o resultado é maior que zero, caso contrário false. 
 *  
 *  c.	Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false. 
 *  
 *  d.	Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false. 
 *  
 *  e.	Imprima true se o resultado é múltiplo de 10, caso contrário false. 
 *  
 *  f.	Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso contrário false.*/

import javax.swing.JOptionPane;

public class Exercicio_12 {
	public static void main(String[] args) {

		double n4;
		double n5;
		double n6;

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número: "));

		/*
		 * a. Imprima o resultado do seguinte cálculo (primeiro número
		 * multiplicado pelo terceiro número mais, o resultado somando com o
		 * segundo número elevado ao cubo).
		 * 
		 * Calculo da A
		 */
		n5 = Math.pow(n2, 3);
		n4 = n1 * n3;
		n6 = n4 + n5;
		// Impressão + final do calculo da A
		System.out.println("A: " + (n6));

		// b. Imprima true se o resultado é maior que zero, caso contrário
		// false.
		if (n6 > 0) {
			System.out.println("B: True");
		} else {
			System.out.println("B: False");
		}

		// c. Imprima true se o resultado é maior que 10 ou maior que 1, caso
		// contrário false.

		if (n6 > 1) {
			System.out.println("C: True");
		} else {
			System.out.println("C: False");
		}

		// d. Imprima true se o resultado é menor que 10 ou maior que 100, caso
		// contrário false.

		if (n6 < 10 | n6 > 100) {
			System.out.println("D: True");
		} else {
			System.out.println("D: False");
		}

		// e. Imprima true se o resultado é múltiplo de 10, caso contrário
		// false.

		if (n6 % 10 == 0) {
			System.out.println("E: True");
		} else {
			System.out.println("E: False");
		}

		// f. Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso
		// contrário false.

		if (n6 % 2 == 0 & n6 % 3 == 0) {
			System.out.println("F: True");
		} else {
			System.out.println("F: False");
		}

	}

}

package Exercicios_Scanner;

/*12.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * 
 * a.	Imprima o resultado do seguinte c�lculo (primeiro n�mero multiplicado pelo terceiro n�mero mais,
 *  o resultado somando com o segundo n�mero elevado ao cubo). 
 *  
 *  b.	Imprima true se o resultado � maior que zero, caso contr�rio false. 
 *  
 *  c.	Imprima true se o resultado � maior que 10 ou maior que 1, caso contr�rio false. 
 *  
 *  d.	Imprima true se o resultado � menor que 10 ou maior que 100, caso contr�rio false. 
 *  
 *  e.	Imprima true se o resultado � m�ltiplo de 10, caso contr�rio false. 
 *  
 *  f.	Imprima true se o resultado � m�ltiplo de 2 e m�ltiplo de 3, caso contr�rio false.*/

import javax.swing.JOptionPane;

public class Exercicio_12 {
	public static void main(String[] args) {

		double n4;
		double n5;
		double n6;

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n�mero: "));

		/*
		 * a. Imprima o resultado do seguinte c�lculo (primeiro n�mero
		 * multiplicado pelo terceiro n�mero mais, o resultado somando com o
		 * segundo n�mero elevado ao cubo).
		 * 
		 * Calculo da A
		 */
		n5 = Math.pow(n2, 3);
		n4 = n1 * n3;
		n6 = n4 + n5;
		// Impress�o + final do calculo da A
		System.out.println("A: " + (n6));

		// b. Imprima true se o resultado � maior que zero, caso contr�rio
		// false.
		if (n6 > 0) {
			System.out.println("B: True");
		} else {
			System.out.println("B: False");
		}

		// c. Imprima true se o resultado � maior que 10 ou maior que 1, caso
		// contr�rio false.

		if (n6 > 1) {
			System.out.println("C: True");
		} else {
			System.out.println("C: False");
		}

		// d. Imprima true se o resultado � menor que 10 ou maior que 100, caso
		// contr�rio false.

		if (n6 < 10 | n6 > 100) {
			System.out.println("D: True");
		} else {
			System.out.println("D: False");
		}

		// e. Imprima true se o resultado � m�ltiplo de 10, caso contr�rio
		// false.

		if (n6 % 10 == 0) {
			System.out.println("E: True");
		} else {
			System.out.println("E: False");
		}

		// f. Imprima true se o resultado � m�ltiplo de 2 e m�ltiplo de 3, caso
		// contr�rio false.

		if (n6 % 2 == 0 & n6 % 3 == 0) {
			System.out.println("F: True");
		} else {
			System.out.println("F: False");
		}

	}

}

package Exercicios_Scanner;

/*Escreva no console 4 números e leia-os.
 * a.	Imprima true se o valor do primeiro número é menor ou igual a soma do 
 * segundo número com o terceiro e o quarto número, for impar ou maior que 
 * 10, caso contrário false.
 * 
 * b.	Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro 
 * mais o quarto dígito for múltiplo de 10, ou múltiplo de 5, ou o primeiro dígito 
 * for 5, ou a soma do primeiro dígito mais o segundo e o terceiro dígito, for 
 * maior que 100.0, e o primeiro dígito maior que 0.
 * 
 * c.	Imprima true se o resultado da questão a e o resultado da questão b forem 
 * verdadeiras, ou o resultado da questão a e o resultado da questão b forem 
 * falsas.
 * 
 * d.	Imprima false se o valor do primeiro dígito mais o segundo, terceiro e quarto 
 * for maior que 10, caso contrário true.
 * 
 * e.	Imprima false se o primeiro número é maior que 10 ou o terceiro número for 
 * maior que 0, ou o segundo número mais o quarto número for igual a 0. Caso 
 * contrário true.*/

import javax.swing.JOptionPane;

public class Exercicio_13 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));
		int n5 = n2 + n3 + n4;

		/*
		 * a. Imprima true se o valor do primeiro número é menor ou igual a soma
		 * do segundo número com o terceiro e o quarto número, e for impar ou
		 * maior que 10, caso contrário false.
		 */

		int[] resultA = new int[2];
		resultA[0] = 0;
		resultA[1] = 0;

		String resultadoA_V = "A = Soma dos valores: " + n5 + " e a operação é: True";
		String resultadoA_F = "A = Soma dos valores: " + n5 + " e a operação é: False";
		if (((n1 <= n5) && (n5 % 2 == 1)) | (n5 > 10)) {
			System.out.println(resultadoA_V);
			resultA[0]++;
		} else {
			System.out.println(resultadoA_F);
			resultA[1]++;
		}

		/*
		 * b. Imprima true se a soma do primeiro dígito mais o segundo mais o
		 * terceiro mais o quarto dígito for múltiplo de 10, ou múltiplo de 5,
		 * ou o primeiro dígito for 5, ou a soma do primeiro dígito mais o
		 * segundo e o terceiro dígito, for maior que 100.0, e o primeiro dígito
		 * maior que 0.
		 */

		int n6 = n1 + n2 + n3 + n4;
		String resultadoB_V = "B: True";
		String resultadoB_F = "B: False";
		if (n6 % 10 == 0 | n6 % 5 == 0 | n1 == 5 | n1 + n2 + n3 > 100 & n1 > 0) {
			System.out.println(resultadoB_V);
			resultA[0]++;
		} else {
			System.out.println(resultadoB_F);
			resultA[1]++;

		}

		/*
		 * c. Imprima true se o resultado da questão a e o resultado da questão
		 * b forem verdadeiras, ou o resultado da questão a e o resultado da
		 * questão b forem falsas.
		 */

		if (resultA[1] == 2 || resultA[0] == 2) {
			System.out.println("C: True");

		} else {

			System.out.println("C: False");

		}

		/*
		 * d. Imprima false se o valor do primeiro dígito mais o segundo,
		 * terceiro e quarto for maior que 10, caso contrário true.
		 */

		int n7 = n1 + n2 + n3 + n4;
		if (n7 > 10) {
			System.out.println("D: False");
		} else {
			System.out.println("D: True");
		}

		/*
		 * e. Imprima false se o primeiro número é maior que 10 ou o terceiro
		 * número for maior que 0, ou o segundo número mais o quarto número for
		 * igual a 0. Caso contrário true.
		 */

		if (n1 > 10 | n3 > 0 | n2 + n4 == 0) {
			System.out.println("E: False");
		} else {
			System.out.println("E: True");
		}

	}
}

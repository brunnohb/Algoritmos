package Exercicios_Scanner;

/*Escreva no console 4 n�meros e leia-os.
 * a.	Imprima true se o valor do primeiro n�mero � menor ou igual a soma do 
 * segundo n�mero com o terceiro e o quarto n�mero, for impar ou maior que 
 * 10, caso contr�rio false.
 * 
 * b.	Imprima true se a soma do primeiro d�gito mais o segundo mais o terceiro 
 * mais o quarto d�gito for m�ltiplo de 10, ou m�ltiplo de 5, ou o primeiro d�gito 
 * for 5, ou a soma do primeiro d�gito mais o segundo e o terceiro d�gito, for 
 * maior que 100.0, e o primeiro d�gito maior que 0.
 * 
 * c.	Imprima true se o resultado da quest�o a e o resultado da quest�o b forem 
 * verdadeiras, ou o resultado da quest�o a e o resultado da quest�o b forem 
 * falsas.
 * 
 * d.	Imprima false se o valor do primeiro d�gito mais o segundo, terceiro e quarto 
 * for maior que 10, caso contr�rio true.
 * 
 * e.	Imprima false se o primeiro n�mero � maior que 10 ou o terceiro n�mero for 
 * maior que 0, ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso 
 * contr�rio true.*/

import javax.swing.JOptionPane;

public class Exercicio_13 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero: "));
		int n5 = n2 + n3 + n4;

		/*
		 * a. Imprima true se o valor do primeiro n�mero � menor ou igual a soma
		 * do segundo n�mero com o terceiro e o quarto n�mero, e for impar ou
		 * maior que 10, caso contr�rio false.
		 */

		int[] resultA = new int[2];
		resultA[0] = 0;
		resultA[1] = 0;

		String resultadoA_V = "A = Soma dos valores: " + n5 + " e a opera��o �: True";
		String resultadoA_F = "A = Soma dos valores: " + n5 + " e a opera��o �: False";
		if (((n1 <= n5) && (n5 % 2 == 1)) | (n5 > 10)) {
			System.out.println(resultadoA_V);
			resultA[0]++;
		} else {
			System.out.println(resultadoA_F);
			resultA[1]++;
		}

		/*
		 * b. Imprima true se a soma do primeiro d�gito mais o segundo mais o
		 * terceiro mais o quarto d�gito for m�ltiplo de 10, ou m�ltiplo de 5,
		 * ou o primeiro d�gito for 5, ou a soma do primeiro d�gito mais o
		 * segundo e o terceiro d�gito, for maior que 100.0, e o primeiro d�gito
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
		 * c. Imprima true se o resultado da quest�o a e o resultado da quest�o
		 * b forem verdadeiras, ou o resultado da quest�o a e o resultado da
		 * quest�o b forem falsas.
		 */

		if (resultA[1] == 2 || resultA[0] == 2) {
			System.out.println("C: True");

		} else {

			System.out.println("C: False");

		}

		/*
		 * d. Imprima false se o valor do primeiro d�gito mais o segundo,
		 * terceiro e quarto for maior que 10, caso contr�rio true.
		 */

		int n7 = n1 + n2 + n3 + n4;
		if (n7 > 10) {
			System.out.println("D: False");
		} else {
			System.out.println("D: True");
		}

		/*
		 * e. Imprima false se o primeiro n�mero � maior que 10 ou o terceiro
		 * n�mero for maior que 0, ou o segundo n�mero mais o quarto n�mero for
		 * igual a 0. Caso contr�rio true.
		 */

		if (n1 > 10 | n3 > 0 | n2 + n4 == 0) {
			System.out.println("E: False");
		} else {
			System.out.println("E: True");
		}

	}
}

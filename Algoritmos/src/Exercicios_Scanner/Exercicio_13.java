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

		if (((n1 <= n5) && (n5 % 2 == 1)) | (n5 > 10)) {
			System.out.println("A = Soma dos valores: " + n5 + " e a opera��o �: True");
		} else {
			System.out.println("A = Soma dos valores: " + n5 + " e a opera��o �: False");
		}

		/*
		 * b. Imprima true se a soma do primeiro d�gito mais o segundo mais o
		 * terceiro mais o quarto d�gito for m�ltiplo de 10, ou m�ltiplo de 5,
		 * ou o primeiro d�gito for 5, ou a soma do primeiro d�gito mais o
		 * segundo e o terceiro d�gito, for maior que 100.0, e o primeiro d�gito
		 * maior que 0.
		 */

	}

}

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

		if (((n1 <= n5) && (n5 % 2 == 1)) | (n5 > 10)) {
			System.out.println("A = Soma dos valores: " + n5 + " e a operação é: True");
		} else {
			System.out.println("A = Soma dos valores: " + n5 + " e a operação é: False");
		}

		/*
		 * b. Imprima true se a soma do primeiro dígito mais o segundo mais o
		 * terceiro mais o quarto dígito for múltiplo de 10, ou múltiplo de 5,
		 * ou o primeiro dígito for 5, ou a soma do primeiro dígito mais o
		 * segundo e o terceiro dígito, for maior que 100.0, e o primeiro dígito
		 * maior que 0.
		 */

	}

}

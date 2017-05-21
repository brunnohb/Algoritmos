package Exercicios_Scanner;
/*9.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
* Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
* Imprima no console true se o primeiro número é menor igual a zero ou o segundo 
* número é maior que 10. Caso contrário imprima false.*/

import javax.swing.JOptionPane;

public class Exercicio_9 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

		if (n1 <= 0 | n2 > 10) {
			JOptionPane.showMessageDialog(null, "True");
		} else {
			JOptionPane.showMessageDialog(null, "False");

		}

	}

}

package Exercicios_Scanner;
/*9.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
* Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
* Imprima no console true se o primeiro n�mero � menor igual a zero ou o segundo 
* n�mero � maior que 10. Caso contr�rio imprima false.*/

import javax.swing.JOptionPane;

public class Exercicio_9 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));

		if (n1 <= 0 | n2 > 10) {
			JOptionPane.showMessageDialog(null, "True");
		} else {
			JOptionPane.showMessageDialog(null, "False");

		}

	}

}

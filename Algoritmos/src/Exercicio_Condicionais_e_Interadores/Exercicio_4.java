package Exercicio_Condicionais_e_Interadores;
/*4.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio 
 * digitou. Se o primeiro n�mero que o usu�rio digitar e o segundo n�mero que o 
 * usu�rio digitou forem m�ltiplos de 7, imprima �os dois n�meros s�o m�ltiplos de 7�, 
 * caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�. */

import javax.swing.JOptionPane;

public class Exercicio_4 {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));

		if (n1 % 7 == 0 && n2 % 7 == 0) {
			JOptionPane.showMessageDialog(null, "Os valores s�o m�ltiplos de 7");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores n�o s�o m�ltiplos de 7");
		}

	}

}

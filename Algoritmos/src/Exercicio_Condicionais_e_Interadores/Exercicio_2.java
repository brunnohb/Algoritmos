package Exercicio_Condicionais_e_Interadores;
/*2.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
 * Verifique se o n�mero � �mpar, caso sim, imprima �o valor digitado � �mpar�, caso 
 * contr�rio imprima �o valor � par�.*/

import javax.swing.JOptionPane;

public class Exercicio_2 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));

		if (n1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O valor digitado � par");

		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado � �mpar");
		}

	}

}

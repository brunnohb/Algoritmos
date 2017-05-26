package Exercicio_Condicionais_e_Interadores;
/*2.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, caso 
 * contrário imprima “o valor é par”.*/

import javax.swing.JOptionPane;

public class Exercicio_2 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		if (n1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O valor digitado é par");

		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado é ímpar");
		}

	}

}

package Exercicio_Condicionais_e_Interadores;
/*4.	Peça para o usuário digitar dois números, pegue os dois números que o usuário 
 * digitou. Se o primeiro número que o usuário digitar e o segundo número que o 
 * usuário digitou forem múltiplos de 7, imprima “os dois números são múltiplos de 7”, 
 * caso contrário imprima, “os dois números não são múltiplos de 7”. */

import javax.swing.JOptionPane;

public class Exercicio_4 {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

		if (n1 % 7 == 0 && n2 % 7 == 0) {
			JOptionPane.showMessageDialog(null, "Os valores são múltiplos de 7");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores não são múltiplos de 7");
		}

	}

}

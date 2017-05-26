package Exercicio_Condicionais_e_Interadores;
/*3.	Peça para o usuário digitar dois números, pegue os dois números que o usuário 
 * digitou. Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5 
 * imprima “o resultado é múltiplo de 5”, caso contrário, imprima “o resultado não foi o 
 * 	esperado”. Após o teste da da condição do if, imprima o resultado da multiplicação.*/

import javax.swing.JOptionPane;

public class Exercicio_3 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		int n3;
		n3 = n1 * n2;

		if (n3 % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O valor é múltiplo de 5");
		} else {
			JOptionPane.showMessageDialog(null, "O valor não é múltiplo de 5");
		}

	}

}

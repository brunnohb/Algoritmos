package Exercicio_Condicionais_e_Interadores;
/*3.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio 
 * digitou. Multiplique os dois n�meros. Se o resultado da multiplica��o for m�ltiplo de 5 
 * imprima �o resultado � m�ltiplo de 5�, caso contr�rio, imprima �o resultado n�o foi o 
 * 	esperado�. Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.*/

import javax.swing.JOptionPane;

public class Exercicio_3 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));
		int n3;
		n3 = n1 * n2;

		if (n3 % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O valor � m�ltiplo de 5");
		} else {
			JOptionPane.showMessageDialog(null, "O valor n�o � m�ltiplo de 5");
		}

	}

}

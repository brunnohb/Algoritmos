package Exercicios_Scanner;
/*Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou. 
 * Some o n�mero que o usu�rio digitou com 5. Imprima o resultado da soma. Pegue o 
 * resultado e some com 5 novamente. Imprima o resultado da soma. */

import javax.swing.JOptionPane;

public class Exercicio_17 {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2;
		int n3;
		n2 = n1 + 5;
		n3 = n2 + 5;
		//System.out.println("Seu primeiro resultado �: " + n2);
		//System.out.println("Seu segundo resultado �: " + n3);
		
		JOptionPane.showMessageDialog(null, "Seu primeiro resultado �: " + n2 + " E seu segundo resultado �: " + n3);
		
	}

}

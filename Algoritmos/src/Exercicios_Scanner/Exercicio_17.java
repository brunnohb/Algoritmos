package Exercicios_Scanner;
/*Peça para o usuário digitar um número. Guarde o número que o usuário digitou. 
 * Some o número que o usuário digitou com 5. Imprima o resultado da soma. Pegue o 
 * resultado e some com 5 novamente. Imprima o resultado da soma. */

import javax.swing.JOptionPane;

public class Exercicio_17 {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2;
		int n3;
		n2 = n1 + 5;
		n3 = n2 + 5;
		//System.out.println("Seu primeiro resultado é: " + n2);
		//System.out.println("Seu segundo resultado é: " + n3);
		
		JOptionPane.showMessageDialog(null, "Seu primeiro resultado é: " + n2 + " E seu segundo resultado é: " + n3);
		
	}

}

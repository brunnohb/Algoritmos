package Exercicios_Scanner;
/*18.	Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou. 
 * Subtraia o n�mero por 5 e imprima o resultado. Pegue novamente o n�mero que o 
 * usu�rio digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da 
 * subtra��o por 5 e o resultado da subtra��o por 3 e imprima os dois resultado.*/

import javax.swing.JOptionPane;

public class Exercicio_18 {
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2;
		int n3;
		int n4;
		
		n2 = n1 - 5;
		n3 = n2 - 3;
	
		
		
		JOptionPane.showMessageDialog(null, "Seu primeiro resultado �: " + n2 + " E seu segundo resultado �: " + n3 + " Ambos os resultados foram: " + n2 + " E " + n3);
		
		
	}

}

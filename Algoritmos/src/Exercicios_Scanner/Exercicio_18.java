package Exercicios_Scanner;
/*18.	Peça para o usuário digitar um número. Guarde o número que o usuário digitou. 
 * Subtraia o número por 5 e imprima o resultado. Pegue novamente o número que o 
 * usuário digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da 
 * subtração por 5 e o resultado da subtração por 3 e imprima os dois resultado.*/

import javax.swing.JOptionPane;

public class Exercicio_18 {
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2;
		int n3;
		int n4;
		
		n2 = n1 - 5;
		n3 = n2 - 3;
	
		
		
		JOptionPane.showMessageDialog(null, "Seu primeiro resultado é: " + n2 + " E seu segundo resultado é: " + n3 + " Ambos os resultados foram: " + n2 + " E " + n3);
		
		
	}

}

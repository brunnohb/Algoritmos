package Exercicios_Scanner;
/*19.	Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou na 
 * vari�vel �primeiroNumero�. Crie outra vari�vel de nome �segundoNumero�, atribuindo 
 * o valor da vari�vel �primeiroNumero�. Altere o valor da variavel �primeiroNumero� 
 * para 10. Imprima a vari�vel �primeiroNumero� e a vari�vel �segundoNumero�. 
 * Verifique os valores das vari�veis, como ficaram.*/

import javax.swing.JOptionPane;

public class Exercicio_19 {
	public static void main(String[] args) {
		int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int segundoNumero = primeiroNumero;
		
		primeiroNumero = 10;
		
		JOptionPane.showMessageDialog(null, primeiroNumero + " " + segundoNumero);
		
		
	}

}

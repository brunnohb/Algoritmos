package Exercicios_Scanner;
/*20.	Pe�a para o usu�rio digitar um texto. Guarde o texto que o usu�rio digitou em uma 
 * vari�vel. Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel que 
 * o usu�rio digitou. Altere o valor da vari�vel que o usu�rio digitou para �Ol�. Imprima 
 * as duas vari�veis, e observe o que foi impresso.*/

import javax.swing.JOptionPane;
public class Exercicio_20 {
	public static void main(String[] args) {
		
		String txt1 = JOptionPane.showInputDialog("Digite um texto: ");
		String outroTexto = txt1;
		
		txt1 = "Ol�, ";
		
		JOptionPane.showMessageDialog(null, txt1 + " " + outroTexto);
		
	}
}

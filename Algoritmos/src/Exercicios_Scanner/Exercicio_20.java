package Exercicios_Scanner;
/*20.	Peça para o usuário digitar um texto. Guarde o texto que o usuário digitou em uma 
 * variável. Crie outra variável de nome “outroTexto”, atribuindo o valor da variável que 
 * o usuário digitou. Altere o valor da variável que o usuário digitou para “Olá”. Imprima 
 * as duas variáveis, e observe o que foi impresso.*/

import javax.swing.JOptionPane;
public class Exercicio_20 {
	public static void main(String[] args) {
		
		String txt1 = JOptionPane.showInputDialog("Digite um texto: ");
		String outroTexto = txt1;
		
		txt1 = "Olá, ";
		
		JOptionPane.showMessageDialog(null, txt1 + " " + outroTexto);
		
	}
}

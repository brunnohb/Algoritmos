package Exercicios_Scanner;
/*19.	Peça para o usuário digitar um número. Guarde o número que o usuário digitou na 
 * variável “primeiroNumero”. Crie outra variável de nome “segundoNumero”, atribuindo 
 * o valor da variável “primeiroNumero”. Altere o valor da variavel “primeiroNumero” 
 * para 10. Imprima a variável “primeiroNumero” e a variável “segundoNumero”. 
 * Verifique os valores das variáveis, como ficaram.*/

import javax.swing.JOptionPane;

public class Exercicio_19 {
	public static void main(String[] args) {
		int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int segundoNumero = primeiroNumero;
		
		primeiroNumero = 10;
		
		JOptionPane.showMessageDialog(null, primeiroNumero + " " + segundoNumero);
		
		
	}

}

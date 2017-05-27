package Exercicio_Condicionais_e_Interadores;
/*7.	Calculadora
 * a.	Peça para o usuário digitar um número, e armazene o número
 * b.	Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o o operador
 * c.	Peça para o usuário digitar outro número, e armazene o número
 * d.	Caso o usuário digitou o operador +, some os dois números e imprima o resultado “Valor da soma: <resultado>”.
 * e.	Caso o usuário digitou o operador -, subtraia os dois números e imprima o resultado “Valor da subtração: <resultado>”.
 * f.	Caso o usuário digitou o operador /, divida os dois números e imprima o resultado “Valor da divisão: <resultado>”.
 * g.	Caso o usuário digitou o operador *, multiplique os dois números e imprima o resultado “Valor da multiplicação: <resultado>”.*/

import javax.swing.JOptionPane;

public class Exercicio_7 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		String operadorDigitado = JOptionPane.showInputDialog("Digite um operador matemático: ");
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

		if (operadorDigitado.equals("+")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua soma é: " + (n1 + n2));
		} else if (operadorDigitado.equals("-")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua subtração é: " + (n1 - n2));
		} else if (operadorDigitado.equals("/")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua divisão é: " + (n1 / n2));
		} else if (operadorDigitado.equals("*")) {
			JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + (n1 * n2));
		} else {
			JOptionPane.showMessageDialog(null, "Tente novamente!");
		}

	}

}

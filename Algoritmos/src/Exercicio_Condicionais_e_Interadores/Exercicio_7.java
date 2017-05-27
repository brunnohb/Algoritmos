package Exercicio_Condicionais_e_Interadores;
/*7.	Calculadora
 * a.	Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero
 * b.	Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e armazene o o operador
 * c.	Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero
 * d.	Caso o usu�rio digitou o operador +, some os dois n�meros e imprima o resultado �Valor da soma: <resultado>�.
 * e.	Caso o usu�rio digitou o operador -, subtraia os dois n�meros e imprima o resultado �Valor da subtra��o: <resultado>�.
 * f.	Caso o usu�rio digitou o operador /, divida os dois n�meros e imprima o resultado �Valor da divis�o: <resultado>�.
 * g.	Caso o usu�rio digitou o operador *, multiplique os dois n�meros e imprima o resultado �Valor da multiplica��o: <resultado>�.*/

import javax.swing.JOptionPane;

public class Exercicio_7 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		String operadorDigitado = JOptionPane.showInputDialog("Digite um operador matem�tico: ");
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));

		if (operadorDigitado.equals("+")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua soma �: " + (n1 + n2));
		} else if (operadorDigitado.equals("-")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua subtra��o �: " + (n1 - n2));
		} else if (operadorDigitado.equals("/")) {
			JOptionPane.showMessageDialog(null, "O resultado da sua divis�o �: " + (n1 / n2));
		} else if (operadorDigitado.equals("*")) {
			JOptionPane.showMessageDialog(null, "O resultado da multiplica��o �: " + (n1 * n2));
		} else {
			JOptionPane.showMessageDialog(null, "Tente novamente!");
		}

	}

}

package Exercicio_2;

/*20)	Perguntar para o usuário o início da lista e o final da lista
 *  que ele quer se seja impressa e imprimir esta lista.*/

import javax.swing.JOptionPane;

public class Exercicio_2_20 {
	public static void main(String[] args) {

		long n1 = Integer.parseInt(JOptionPane.showInputDialog
				("Digite o ínicio de sua lista: "));
		long n2 = Integer.parseInt(JOptionPane.showInputDialog
				("Digite o final de sua lista: "));
		while (n1 <= n2) {
			System.out.println(n1);
			n1++;
		}
	}
}

package Exercicio_Condicionais_e_Interadores;

/*12.	Escreve um algoritmo que o usu�rio entre com tr�s n�meros, e imprima os n�meros em ordem decrescente.*/

import javax.swing.JOptionPane;

public class Exercicio_12 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n�mero: "));

		if ((n1 > n2 && n1 > n3) && (n2 > n3)) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} else if ((n1 > n2 && n1 > n3) && (n3 > n2)) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		} else if ((n2 > n1 && n2 > n3) && (n1 > n3)) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		} else if ((n2 > n1 && n2 > n3) && (n3 > n1)) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		} else if ((n3 > n1 && n3 > n2) && (n1 > n2)) {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		} else if ((n3 > n1 && n3 > n2) && (n2 > n1)) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}

	}

}
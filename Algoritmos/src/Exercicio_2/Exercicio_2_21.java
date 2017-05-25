package Exercicio_2;

import javax.swing.JOptionPane;

/*21)	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. 
Necessitará de 2 for.
1
1 1  
1 1 1  
1 1 1 1
1 1 1 1 1
1 1 1 1 1 1  
*/

public class Exercicio_2_21 {
	public static void main(String[] args) {

		int qtdlinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: "));

		for (int linhas = 0; linhas < qtdlinhas; linhas++) {
			for (int colunas = 0; colunas <= linhas; colunas++) {
				System.out.print("1 ");
			}
			System.out.println("");
		}

	}

}

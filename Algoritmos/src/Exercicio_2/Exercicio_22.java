package Exercicio_2;
/*22)	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
01
02 02  
03 03 03  
04 04 04 04  
05 05 05 05 05  
06 06 06 06 06 06  
07 07 07 07 07 07 07  
08 08 08 08 08 08 08 08  
09 09 09 09 09 09 09 09 09  
10 10 10 10 10 10 10 10 10 10  
11 11 11 11 11 11 11 11 11 11 11 */

import javax.swing.JOptionPane;

public class Exercicio_22 {
	public static void main(String[] args) {

		int qtdlinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: "));

		for (int linhas = 0; linhas <= qtdlinhas; linhas++) {
			for (int colunas = 1; colunas <= linhas; colunas++) {
				if (linhas < 10) {
					System.out.print("0" + linhas + " ");
				} else {
					System.out.print(linhas + " ");
				}
			}
			System.out.println("");

		}

	}

}

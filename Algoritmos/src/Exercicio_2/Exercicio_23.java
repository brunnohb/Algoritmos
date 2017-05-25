package Exercicio_2;
/*23)	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
11 11 11 11 11 11 11 11 11 11 11
10 10 10 10 10 10 10 10 10 10  
09 09 09 09 09 09 09 09 09  
08 08 08 08 08 08 08 08  
07 07 07 07 07 07 07 
06 06 06 06 06 06  
05 05 05 05 05  
04 04 04 04  
03 03 03  
02 02  
01  */

import javax.swing.JOptionPane;

public class Exercicio_23 {
	public static void main(String[] args) {

		int qtdlinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: "));
		int n1 = qtdlinhas;
		for (int linhas = 1; linhas <= qtdlinhas; linhas++) {
			for (int colunas = qtdlinhas; colunas >= linhas; colunas--) {
				if (n1 < 10) {
					System.out.print("0" + n1 + " ");
				} else {
					System.out.print(n1 + " ");
				}
			}
			System.out.println("");
			n1--;
		}

	}

}

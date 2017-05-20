package Exercicio_2;

/*19)	Imprimir o resultado do número elevado ao quadrado,
 *  de uma lista com 100 posições.*/
public class Exercicio_2_19 {
	public static void main(String[] args) {

		int n1 = 1;
		int n3 = 1;

		String array[] = new String[100];
		for (int i = 0; i < 100; i++) {
			n3 = n1 * n1;
			System.out.println(n1 + " Elevado ao quadrado: " + n3);
			n1++;
		}
	}

}

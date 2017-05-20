package Exercicio_2;

//13)	Imprima somente números divisíveis por 5, de 1000 à 0;
public class Exercicio_2_13 {
	public static void main(String[] args) {

		int n1 = 1000;

		while (n1 >= 0) {
			System.out.println(n1);
			n1 = n1 - 5;
		}

	}
}

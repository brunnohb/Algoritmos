package Exercicio_2;

//12)	Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
public class Exercicio_2_12 {
	public static void main(String[] args) {

		int n1 = 0;

		while (n1 <= 1000) {
			if (n1 % 2 == 0)
				System.out.println(n1);
			n1 = n1 + 15;
		}
	}
}

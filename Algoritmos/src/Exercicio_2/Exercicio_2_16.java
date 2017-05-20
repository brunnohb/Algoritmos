package Exercicio_2;

/*16)	Imprima apenas números que se divididos por 5 o resultado seja maior que 3
, de 10 à 1000;*/
public class Exercicio_2_16 {
	public static void main(String[] args) {

		int n1 = 10;
		while (n1 <= 1000) {
			if (n1 < 20) {
				n1++;
			} else {
				System.out.println(n1);
				n1 = n1 + 5;
			}
		}

	}

}

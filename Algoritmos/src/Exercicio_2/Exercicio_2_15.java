package Exercicio_2;

/*15)	Imprima apenas n�meros do qual a divis�o por 3, 
retorne um n�mero inteiro, de -10 � 500;*/
public class Exercicio_2_15 {
	public static void main(String[] args) {

		int n1 = -10;

		while (n1 <= 500) {
			if (n1 < 3) {
				n1++;
			} else {

				System.out.println(n1);
				n1 = n1 + 3;
			}
		}
	}

}

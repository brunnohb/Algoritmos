package Exercicio_2;

/*17)	Imprimir uma lista semelhante a lista abaixo:
1_10
2_9
3_8
4_7
5_6
6_5
7_4
8_3
9_2
10_1
*/
public class Exercicio_2_17 {
	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 10;
		while (n1 <= 10) {
			System.out.println(n1 + "_" + n2);

			n1++;
			n2--;

		}

	}

}

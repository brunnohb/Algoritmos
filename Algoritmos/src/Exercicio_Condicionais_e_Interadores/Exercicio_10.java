package Exercicio_Condicionais_e_Interadores;
/*10.	Pe�a para o usu�rio digitar dois n�meros double. E efetue as seguintes valida��es:
 * a.	Se a soma dos n�meros for maior que 20, imprima no console �<resultado da soma> � maior que 20�
 * b.	Se a soma dos n�meros for maior que 30, imprima no console �<resultado da soma> � maior que 30�
 * c.	Se a soma dos n�meros for maior que 10 ou maior que 20, imprima no console �<resultado da soma> � maior que 10 ou <resultado da soma> maior que 20 �
 * d.	Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, imprima no console �<resultado da soma> � m�ltiplo de 5 e <resultado da soma> de 10�
 * e.	Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, ou o primeiro n�mero digitado � 5, 
 * imprima no console �<resultado da soma> � m�ltiplo de 5 e <resultado da soma> de 10 ou o <primeiro n�mero digitado> � 5�*/

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n1;
		System.out.println("Digite um n�mero Double: ");
		n1 = scanner.nextInt();

		double n2;
		System.out.println("Digite outro n�mero Double: ");
		n2 = scanner.nextInt();

		double n3;
		n3 = n1 + n2;

		if (n3 > 20) {
			System.out.println("A: " + n3 + " � maior que 20.");
		} else {
			System.out.println("A: ");
		}
		if (n3 > 30) {
			System.out.println("B: " + n3 + " � maior que 30.");
		} else {
			System.out.println("B: ");
		}
		if (n3 > 10 && n3 < 20) {
			System.out.println("C: " + n3 + " � maior que 10.");
		} else if (n3 > 20) {
			System.out.println("C: " + n3 + "� maior que 20.");
		} else {
			System.out.println("C: ");
		}

		if (n3 % 5 == 8 & n3 % 10 == 0) {
			System.out.println("D: " + n3 + " � multiplo de 5, E, " + n3 + " � multiplo de 10");
		} else {
			System.out.println("D: ");
		}

		if (n3 % 5 == 0 & n3 % 10 == 0 | n1 == 5) {
			System.out.println("E: " + n3 + " � multiplo de 5, E " + n3 + " � multiplo de 10. Ou, " + n1 + " � 5.");
		} else {
			System.out.println("E: ");
		}

	}

}

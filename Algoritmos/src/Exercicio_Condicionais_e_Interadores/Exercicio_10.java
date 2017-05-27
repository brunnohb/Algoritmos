package Exercicio_Condicionais_e_Interadores;
/*10.	Peça para o usuário digitar dois números double. E efetue as seguintes validações:
 * a.	Se a soma dos números for maior que 20, imprima no console “<resultado da soma> é maior que 20”
 * b.	Se a soma dos números for maior que 30, imprima no console “<resultado da soma> é maior que 30”
 * c.	Se a soma dos números for maior que 10 ou maior que 20, imprima no console “<resultado da soma> é maior que 10 ou <resultado da soma> maior que 20 ”
 * d.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10”
 * e.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro número digitado é 5, 
 * imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10 ou o <primeiro número digitado> é 5”*/

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n1;
		System.out.println("Digite um número Double: ");
		n1 = scanner.nextInt();

		double n2;
		System.out.println("Digite outro número Double: ");
		n2 = scanner.nextInt();

		double n3;
		n3 = n1 + n2;

		if (n3 > 20) {
			System.out.println("A: " + n3 + " É maior que 20.");
		} else {
			System.out.println("A: ");
		}
		if (n3 > 30) {
			System.out.println("B: " + n3 + " É maior que 30.");
		} else {
			System.out.println("B: ");
		}
		if (n3 > 10 && n3 < 20) {
			System.out.println("C: " + n3 + " É maior que 10.");
		} else if (n3 > 20) {
			System.out.println("C: " + n3 + "É maior que 20.");
		} else {
			System.out.println("C: ");
		}

		if (n3 % 5 == 8 & n3 % 10 == 0) {
			System.out.println("D: " + n3 + " É multiplo de 5, E, " + n3 + " É multiplo de 10");
		} else {
			System.out.println("D: ");
		}

		if (n3 % 5 == 0 & n3 % 10 == 0 | n1 == 5) {
			System.out.println("E: " + n3 + " É multiplo de 5, E " + n3 + " É multiplo de 10. Ou, " + n1 + " É 5.");
		} else {
			System.out.println("E: ");
		}

	}

}

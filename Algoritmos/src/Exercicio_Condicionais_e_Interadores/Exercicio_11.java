package Exercicio_Condicionais_e_Interadores;

/*11.	Escreve um algoritmo que o usu�rio entre com tr�s n�meros e imprima o maior n�mero entre eles, utilizando apenas um System.out.println.*/

import java.util.Scanner;

public class Exercicio_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int resultado;
		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();

		int n2;
		System.out.println("Digite outro n�mero: ");
		n2 = scanner.nextInt();

		int n3;
		System.out.println("Digite mais um n�mero: ");
		n3 = scanner.nextInt();

	
		
		if(n1 > n2 & n1 > n3){
			resultado = n1;
		} else if (n2 > n1 & n2 > n3){
			resultado = n2;
		} else {
			resultado = n3;
		}
		
		System.out.println("O maior n�mero �: " + resultado);
	}

}

package Exercicios_Scanner;

/*11.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o resto do primeiro número digitado com o segundo número 
 * digitado, o multiplicando por 10. */

import java.util.Scanner;


public class Exercicio_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n3 = 0;
		
		int n1;
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();
		
		int n2;
		System.out.println("Digite outro número: ");
		n2 = scanner.nextInt();
		
		n3 = n1 / n2;
		
		if(n3 % 2 == 1){
			
		
			System.out.println(n3 * 10);
		}else{	
			System.out.println(0);
					
			scanner.close();
		
		}
	}

}

package Exercicios_Scanner;

/*11.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console o resto do primeiro n�mero digitado com o segundo n�mero 
 * digitado, o multiplicando por 10. */

import java.util.Scanner;


public class Exercicio_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n3 = 0;
		
		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();
		
		int n2;
		System.out.println("Digite outro n�mero: ");
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

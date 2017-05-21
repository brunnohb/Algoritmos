package Exercicios_Scanner;
/*2.	Escreva no console para digitar um texto,
leia o texto digitado e imprima o texto no console*/

import java.util.Scanner;

public class Scanner_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String txt;
		System.out.println("Digite um texto: ");
		txt = scanner.next();

		System.out.println(txt);

		scanner.close();
	}
}

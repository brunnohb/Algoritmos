package Exercicios_Scanner;
import java.math.BigDecimal;
/*23.	Diga se o c�digo abaixo esta condizente com o que ser� impresso no console, se 
 * n�o, o por que e diga o resultado correto.*/
public class Exercicio_23 {
	public static void main(String[] args) {
		
	
/*	String texto = "Vin�cius";
	String outroTexto = texto + "Ferneda";
	texto = outroTexto + "Ferneda";
	System.out.println(outroTexto);
	
	Console:
	ViniciusFernedaFerneda
	N�O CONDIZ, POR QUE: POR QUE S� FOI IMPRESSO A STRING outroTexto, QUE POSSU�A: Vin�ciusFerneda*/
		
	/*String texto = "Vin�cius";
	String outroTexto = texto + "Ferneda";
	texto = outroTexto + "Ferneda";
	System.out.println(texto);*/
		
										
		
											/*int numero = 1;
											int outroNumero = 2 + 1;
											System.out.println(numero + 2);
											outroNumero = numero + 1;
											outroNumero = outroNumero + numero;
											System.out.println(outroNumero );

											Console:							
											3
											3
											OK*/
		
		
		
		/*int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero + 1);
		outroNumero = numero + 1;
		System.out.println(numero);

		Console:
		21		
		22
		N�O CONDIZ, POR QUE: NA IMPRESS�O FOI SOMADO + 1 NO PRIMERIO SYS.OUT*/
		
		/*int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero);
		outroNumero = numero + 1;
		System.out.println(numero + 1);*/
		
		
											/*		double numero = 0.1 + 0.2;
													numero = 0.1 + 0.2;
													double outroNumero = numero - 0.1;
													numero = outroNumero;
													outroNumero = numero - 1;
													System.out.println(numero);
											
													Console: 
													0.3
													N�O, POR QUE: A VARI�VEL DOUBLE LOCALIZA O NUMERO 0.1 COMO BIN�RIO, QUE NO C�DIGO IEEE 754 FICA UM VALOR INFINITO, 
													ALGO COMO: "0.110011001100.." O RESULTADO SERIA UTILIZAR O BIGDECIMAL.*/

	
													/*BigDecimal big1 = new BigDecimal("0.1");
													BigDecimal big2 = new BigDecimal("0.2");
													BigDecimal bigResult = big1.add(big2);
													System.out.println(bigResult.toString());*/
		
		
		
/*		String numero = "A";
		int texto = 1;
		numero = numero + numero;
		texto = texto;
		texto = 2;
		System.out.println(numero);
		System.out.println(texto);
	
		Console:
		1
		2
		N�O, POR QUE A VARI�VEL numero ESTA COMO STRING, ARMAZENANDO AA*/
		
/*//		String numero = "A";
		int texto = 1;
//		numero = numero + numero;
		texto = texto;
		texto = 2;
		System.out.println(texto - 1);
		System.out.println(texto);*/
		
/*		boolean numero = true;
		String booleano = "false";
		numero = false | true;
		booleano = "false | false";
		numero = false | numero;
		System.out.println(booleano );	
		System.out.println(numero );

	Console:
	false
	true
	N�O CONDIZ, POR QUE: A ULTIMA PARTE DA VARI�VEL booleano EST� RECEBENDO FALSE | FALSE*/
		
		/*boolean numero = true;
		String booleano = "false";
		numero = false | true;
		booleano = "false";
		numero = false | numero;
		System.out.println(booleano );	
		System.out.println(numero );*/



		

		
		
	}
}

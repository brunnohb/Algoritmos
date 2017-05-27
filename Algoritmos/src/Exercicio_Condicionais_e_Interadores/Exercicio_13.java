package Exercicio_Condicionais_e_Interadores;
/*13.	Escreva um algoritmo que o usuário entre com o salário da pessoa e imprima o 
 * salário líquido, segundo as informações abaixo, utilizando apenas um 
 * System.out.println:
 * a.	Menor ou igual a R$ 600,00 é isento
 * b.	Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto é de 20%
 * c.	Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00 o desconto é 25%
 * d.	Maior que R$ 2000,00 o desconto é 30%
 * Sendo que o salário líquido é igual ao salário bruno menos os descontos.*/
//Salário bruno??? em barras de ouro que valem mais do que dinheiro, maoe
import javax.swing.JOptionPane;

public class Exercicio_13 {
	public static void main(String[] args) {

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
		double salariofinal = 0;
		if (salario <= 600) {
			salariofinal = salario;
		} else if (salario > 600 & salario <= 1200) {
			salariofinal = salario * 0.8;
		} else if (salario > 1200 & salario <= 2000) {
			salariofinal = salario * 0.75;
		} else if (salario > 2000) {
			salariofinal = salario * 0.70;
		}
		System.out.println(salariofinal);
	}

}

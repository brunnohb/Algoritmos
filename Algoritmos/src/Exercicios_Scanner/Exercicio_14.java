package Exercicios_Scanner;
/*14.	Escreva no console as seguintes questão:
a.	Pergunte para o usuário as seguintes questões, as responta e armazene em variáveis.
i.	Digite seu nome:
ii.	Digite seu ano de nascimento:
iii.	Digite seu telefone:
iv.	Digite a cidade de nascimento
b.	Imprima no console o seguinte texto concatenando as variáveis
i.	Meu nome é <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos. 
Se você quiser entrar em contato comigo, pode ligar para o telefone <telefone>. Há esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>.
*/

import java.util.Calendar; 
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Exercicio_14 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
		int  ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		String tel = JOptionPane.showInputDialog("Digite seu telefone: ");
		String cidade = JOptionPane.showInputDialog("Digite sua cidade de nascimento: ");
		
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		System.out.println("Meu nome é: " + nome + ", nasci no ano: " + ano + ", tenho " + (anoAtual - ano) + " anos.");
		System.out.println("Se você quiser entrar em contato comigo, pode ligar para o telefone: " + tel + ". Há esqueci de te dizer aonde eu nasci, foi na cidade de: " + cidade + ".");
		
		
	}

}

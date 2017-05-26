package Exercicio_Condicionais_e_Interadores;
/*5.	Peça para o usuário digitar a idade e ano de nascimento. Pegue os valores que o 
 * usuário digitou. Verifique se a idade digitada condiz com o ano de nascimento do 
 * usuário, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima 
 * “Você não mentiu para mim”, caso contrário, imprima “Você mentiu para mim, você 
 * não é mais meu amigo”.*/

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio_5 {
	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		if (idade == (anoAtual - anoNasc)) {
			JOptionPane.showMessageDialog(null, "Você não mentiu para mim, para o seu bem.");
		} else {
			JOptionPane.showMessageDialog(null, "Você mentiu para mim, você não é mais meu amigo.");
		}

	}

}

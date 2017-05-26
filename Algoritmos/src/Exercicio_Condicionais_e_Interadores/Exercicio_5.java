package Exercicio_Condicionais_e_Interadores;
/*5.	Pe�a para o usu�rio digitar a idade e ano de nascimento. Pegue os valores que o 
 * usu�rio digitou. Verifique se a idade digitada condiz com o ano de nascimento do 
 * usu�rio, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima 
 * �Voc� n�o mentiu para mim�, caso contr�rio, imprima �Voc� mentiu para mim, voc� 
 * n�o � mais meu amigo�.*/

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio_5 {
	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que voc� nasceu: "));

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		if (idade == (anoAtual - anoNasc)) {
			JOptionPane.showMessageDialog(null, "Voc� n�o mentiu para mim, para o seu bem.");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� mentiu para mim, voc� n�o � mais meu amigo.");
		}

	}

}

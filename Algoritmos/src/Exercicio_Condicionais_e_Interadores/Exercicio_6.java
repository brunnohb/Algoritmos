package Exercicio_Condicionais_e_Interadores;

/*6.	Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a 
 * para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais 
 * informa��es efetue as seguintes condi��es:
 * a.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Velha�, caso sim, imprima �Voc� se atrasar� para o trabalho!�.
 * b.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�, caso sim, imprima �Voc� se atrasar� muito mais para o trabalho!�.
 * c.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�, caso sim, imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.
 * d.	Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, caso sim, imprima �OK, voc� gosta de pegar tr�nsito!�.
 * f.	No final pe�a para o usu�rio responder a pergunta �Voc� concorda com o que eu disse?� utilizando System.out.println e pegue o que o usu�rio digitar com Scanner.
 *  Caso o usu�rio digitar true, imprima �Show de bola�, caso contr�rio �Ok, problema � nosso!�.*/

import javax.swing.JOptionPane;

public class Exercicio_6 {
	public static void main(String[] args) {
		String ondemora = JOptionPane.showInputDialog("Qual cidade voc� mora?");
		String bairro = JOptionPane.showInputDialog("Qual o bairro que voc� mora?");

		if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Velha")) {
			JOptionPane.showMessageDialog(null, "Voc� se atrasar� para o trabalho!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Fortaleza")) {
			JOptionPane.showMessageDialog(null, "Voc� se atrasar� muito mais para o trabalho!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Garcia")) {
			JOptionPane.showMessageDialog(null, "Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Belchior")) {
			JOptionPane.showMessageDialog(null, "OK, voc� gosta de pegar tr�nsito!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Testo Salto")){
			JOptionPane.showMessageDialog(null, "Ok, n�o sei onde fica.");
		
		} else {
			JOptionPane.showMessageDialog(null, "Favor tentar novamente mais tarde...");
		}

		int resultado = JOptionPane.showConfirmDialog(null, "Voc� concorda com o que eu disse?");

		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "SHOW DE BOLA!");
		} else {
			JOptionPane.showMessageDialog(null, "Ok, problema � nosso!");
		}

	}

}

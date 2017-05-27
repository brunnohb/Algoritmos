package Exercicio_Condicionais_e_Interadores;

/*6.	Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça 
 * para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais 
 * informações efetue as seguintes condições:
 * a.	Verifique se o usuário mora em “Blumenau” e no bairro “Velha”, caso sim, imprima “Você se atrasará para o trabalho!”.
 * b.	Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”, caso sim, imprima “Você se atrasará muito mais para o trabalho!”.
 * c.	Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, caso sim, imprima “Você tem que sair de madrugada para não pegar trânsito!”.
 * d.	Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim, imprima “OK, você gosta de pegar trânsito!”.
 * f.	No final peça para o usuário responder a pergunta “Você concorda com o que eu disse?” utilizando System.out.println e pegue o que o usuário digitar com Scanner.
 *  Caso o usuário digitar true, imprima “Show de bola”, caso contrário “Ok, problema é nosso!”.*/

import javax.swing.JOptionPane;

public class Exercicio_6 {
	public static void main(String[] args) {
		String ondemora = JOptionPane.showInputDialog("Qual cidade você mora?");
		String bairro = JOptionPane.showInputDialog("Qual o bairro que você mora?");

		if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Velha")) {
			JOptionPane.showMessageDialog(null, "Você se atrasará para o trabalho!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Fortaleza")) {
			JOptionPane.showMessageDialog(null, "Você se atrasará muito mais para o trabalho!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Garcia")) {
			JOptionPane.showMessageDialog(null, "Você tem que sair de madrugada para não pegar trânsito!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Belchior")) {
			JOptionPane.showMessageDialog(null, "OK, você gosta de pegar trânsito!");
		} else if (ondemora.equalsIgnoreCase("Blumenau") == bairro.equalsIgnoreCase("Testo Salto")){
			JOptionPane.showMessageDialog(null, "Ok, não sei onde fica.");
		
		} else {
			JOptionPane.showMessageDialog(null, "Favor tentar novamente mais tarde...");
		}

		int resultado = JOptionPane.showConfirmDialog(null, "Você concorda com o que eu disse?");

		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "SHOW DE BOLA!");
		} else {
			JOptionPane.showMessageDialog(null, "Ok, problema é nosso!");
		}

	}

}

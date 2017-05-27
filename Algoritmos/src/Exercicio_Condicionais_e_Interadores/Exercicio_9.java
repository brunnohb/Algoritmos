package Exercicio_Condicionais_e_Interadores;

import javax.swing.JOptionPane;

/*9.	Mariazinha quer sair com amigas no domingo a tarde no shopping. Só que ela não
 * sabe que roupa ela vai usar ainda, por que ela não viu o jornal do clima na tv. Desta 
 * na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual 
 * roupa ela usará. Contudo a Mariazinha já nos disse o que ela usará em cada clima e 
 * temperatura. Desta forma, escreva um algoritmo que verifique as condições do 
 * tempo (clima e temperatura) e imprima no console qual a roupa que a Mariazinha 
 * escolheu para usar.
 * a.	Se estiver sol ela usuário blusa
 * b.	Se estiver sol e a temperatura estiver acima de 30° ela usará saia
 * c.	Se estiver sol e a temperatura estiver abaixo ou igual a 30° e maior ou igual a 23° ela usará shorts.
 * d.	Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça jeans.
 * e.	Se estiver nublado e a temperatura estiver mais que 25° graus ela usará vestido.
 * f.	Se estiver nublado e a temperatura estiver menor ou igual a 25° ela usará calça de moletom e sobretudo. 
 * g.	Se estiver chovendo ela usará bota e calça  jean
 * h.	Se estiver chovendo e a temperatura for menor ou igual a 10° ela usará blusa e um casaco de lã.
 * i.	Se estiver chovendo e a temperatura for maior que 10° e menor que 25° ela usará camisete. 
 * j.	Se estiver chovendo e a temperatura for maior ou igual a 25° ela usará uma blusa regata
 * k.	Caso contrário ela vai ficar em casa*/
public class Exercicio_9 {
	public static void main(String[] args) {

		String clima = JOptionPane.showInputDialog("Como está o Clima lá fora (Sol, Nublado ou Chovendo?)?");
		int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Como está a temperatura lá fora?"));

		if (clima.equalsIgnoreCase("Sol")) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará blusa.");
		} else if (clima.equalsIgnoreCase("Sol") && temperatura > 30) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará saia.");
		} else if (clima.equalsIgnoreCase("Sol") && (temperatura <= 30 && temperatura >= 23)) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará shorts");
		} else if (clima.equalsIgnoreCase("Sol") && temperatura < 23) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará calça jeans");
		} else if (clima.equalsIgnoreCase("Nublado") && temperatura > 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará vestido.");
		} else if (clima.equalsIgnoreCase("Nublado") && temperatura <= 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará calça de moletom e sobretudo");
		} else if (clima.equalsIgnoreCase("Chovendo")) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará bota e calça jeans");
		} else if (clima.equalsIgnoreCase("Chovendo") && temperatura <= 10) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará blusa e um casaco de lã.");
		} else if (clima.equalsIgnoreCase("Chovendo") && (temperatura > 10 && temperatura < 25)) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará camisete.");
		} else if (clima.equalsIgnoreCase("Chovendo") && temperatura >= 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usará blusa regata.");
		} else {
			JOptionPane.showMessageDialog(null, "Mariazinha ficará em casa.");
		}

	}

}

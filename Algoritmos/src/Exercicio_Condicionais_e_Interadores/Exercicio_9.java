package Exercicio_Condicionais_e_Interadores;

import javax.swing.JOptionPane;

/*9.	Mariazinha quer sair com amigas no domingo a tarde no shopping. S� que ela n�o
 * sabe que roupa ela vai usar ainda, por que ela n�o viu o jornal do clima na tv. Desta 
 * na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual 
 * roupa ela usar�. Contudo a Mariazinha j� nos disse o que ela usar� em cada clima e 
 * temperatura. Desta forma, escreva um algoritmo que verifique as condi��es do 
 * tempo (clima e temperatura) e imprima no console qual a roupa que a Mariazinha 
 * escolheu para usar.
 * a.	Se estiver sol ela usu�rio blusa
 * b.	Se estiver sol e a temperatura estiver acima de 30� ela usar� saia
 * c.	Se estiver sol e a temperatura estiver abaixo ou igual a 30� e maior ou igual a 23� ela usar� shorts.
 * d.	Se estiver sol e a temperatura estiver abaixo de 23� graus ela usu�rio cal�a jeans.
 * e.	Se estiver nublado e a temperatura estiver mais que 25� graus ela usar� vestido.
 * f.	Se estiver nublado e a temperatura estiver menor ou igual a 25� ela usar� cal�a de moletom e sobretudo. 
 * g.	Se estiver chovendo ela usar� bota e cal�a  jean
 * h.	Se estiver chovendo e a temperatura for menor ou igual a 10� ela usar� blusa e um casaco de l�.
 * i.	Se estiver chovendo e a temperatura for maior que 10� e menor que 25� ela usar� camisete. 
 * j.	Se estiver chovendo e a temperatura for maior ou igual a 25� ela usar� uma blusa regata
 * k.	Caso contr�rio ela vai ficar em casa*/
public class Exercicio_9 {
	public static void main(String[] args) {

		String clima = JOptionPane.showInputDialog("Como est� o Clima l� fora (Sol, Nublado ou Chovendo?)?");
		int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Como est� a temperatura l� fora?"));

		if (clima.equalsIgnoreCase("Sol")) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� blusa.");
		} else if (clima.equalsIgnoreCase("Sol") && temperatura > 30) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� saia.");
		} else if (clima.equalsIgnoreCase("Sol") && (temperatura <= 30 && temperatura >= 23)) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� shorts");
		} else if (clima.equalsIgnoreCase("Sol") && temperatura < 23) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� cal�a jeans");
		} else if (clima.equalsIgnoreCase("Nublado") && temperatura > 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� vestido.");
		} else if (clima.equalsIgnoreCase("Nublado") && temperatura <= 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� cal�a de moletom e sobretudo");
		} else if (clima.equalsIgnoreCase("Chovendo")) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� bota e cal�a jeans");
		} else if (clima.equalsIgnoreCase("Chovendo") && temperatura <= 10) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� blusa e um casaco de l�.");
		} else if (clima.equalsIgnoreCase("Chovendo") && (temperatura > 10 && temperatura < 25)) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� camisete.");
		} else if (clima.equalsIgnoreCase("Chovendo") && temperatura >= 25) {
			JOptionPane.showMessageDialog(null, "Mariazinha usar� blusa regata.");
		} else {
			JOptionPane.showMessageDialog(null, "Mariazinha ficar� em casa.");
		}

	}

}

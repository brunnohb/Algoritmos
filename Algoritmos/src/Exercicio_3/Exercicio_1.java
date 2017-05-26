package Exercicio_3;

import javax.swing.JOptionPane;

/*Pizza de calabresa
	Pizza de 4 queijos
	Pizza de frango
	Pizza de lombinho
	Pizza de coração
	Pizza de carne
	Pizza de strogonoff de frango
	Pizza de strogonoff de carne
	Pizza de 5 queijos
	Pizza de banana split
	Pizza de sonho de valsa
	Pizza de prestígio
	Pizza de chocolate preto
	Pizza de chocolate branco 
	Pizza de co42co*/

public class Exercicio_1 {
	public static void main(String[] args) {
		double[] pizzas = new double[15];

		pizzas[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de calabresa: "));
		pizzas[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de 4 queijos: "));
		pizzas[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de frango: "));
		pizzas[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de lombinho: "));
		pizzas[4] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de coração: "));
		pizzas[5] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de carne: "));
		pizzas[6] = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de strogonoff de frango: "));
		pizzas[7] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de strogonoff de carne: "));
		pizzas[8] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de 5 queijos: "));
		pizzas[9] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de banana split: "));
		pizzas[10] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de sonho de valsa: "));
		pizzas[11] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de prestígio: "));
		pizzas[12] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de chocolate preto: "));
		pizzas[13] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de chocolate branco: "));
		pizzas[14] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Pizza de coco: "));

		System.out.println("Pizza 1 = calabresa: R$ " + pizzas[0]);
		System.out.println("Pizza 2 = 4 queijos: R$ " + pizzas[1]);
		System.out.println("Pizza 3 = frango: R$ " + pizzas[2]);
		System.out.println("Pizza 4 = lombinho: R$ " + pizzas[3]);
		System.out.println("Pizza 5 = coração: R$ " + pizzas[4]);
		System.out.println("Pizza 6 = carne: R$ " + pizzas[5]);
		System.out.println("Pizza 7 = strogonoff de frango: R$ " + pizzas[6]);
		System.out.println("Pizza 8 = strogonoff de carne: R$ " + pizzas[7]);
		System.out.println("Pizza 9 = 5 queijos: R$ " + pizzas[8]);
		System.out.println("Pizza 10 = banana split: R$ " + pizzas[9]);
		System.out.println("Pizza 11 = sonho de valsa: R$ " + pizzas[10]);
		System.out.println("Pizza 12 = prestígio: R$ " + pizzas[11]);
		System.out.println("Pizza 13 = chocolate preto: R$ " + pizzas[12]);
		System.out.println("Pizza 14 = chocolate branco: R$ " + pizzas[13]);
		System.out.println("Pizza 15 = coco: R$ " + pizzas[14]);

		int pedidoCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual a pizza que você deseja? "));
		int resultado = 0;
		switch (pedidoCliente) {
		case 1:
			resultado += pizzas[0];
			break;
		case 2:
			resultado += pizzas[1];
			break;
		case 3:
			resultado += pizzas[2];
			break;
		case 4:
			resultado += pizzas[3];
			break;
		case 5:
			resultado += pizzas[4];
			break;
		case 6:
			resultado += pizzas[5];
			break;
		case 7:
			resultado += pizzas[6];
			break;
		case 8:
			resultado += pizzas[7];
			break;
		case 9:
			resultado += pizzas[8];
			break;
		case 10:
			resultado += pizzas[9];
			break;
		case 11:
			resultado += pizzas[10];
			break;
		case 12:
			resultado += pizzas[11];
			break;
		case 13:
			resultado += pizzas[12];
			break;
		case 14:
			resultado += pizzas[13];
			break;
		case 15:
			resultado += pizzas[14];
			break;

		default:
			break;

		}
		System.out.println("O valor da sua pizza é: " + resultado);
	}

}

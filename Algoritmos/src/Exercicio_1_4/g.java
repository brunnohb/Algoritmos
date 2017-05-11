package Exercicio_1_4;

public class g {
	public static void main(String[] args) {
		boolean condicao = true;
		// boolean segundaCondicao = false;
		boolean segundaCondicao = true;
		if (condicao & !!segundaCondicao == true) {
			System.out.println("Entrou no if");
		}
	}
}

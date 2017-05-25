/*16.	Fale para o usu�rio digitar no console apenas n�meros, quantos o mesmo achar necess�rio. Ap�s o usu�rio digitar, o algoritmo deve substituir todas os n�meros pelas respectivas letras, conforme quadro abaixo. Ou seja, se o usu�rio digitar o seguinte valor (1 4 2 3 5 3), deve ser impresso no console (A D B C E C).
a.	1 = A
b.	2 = B
c.	3 = C
d.	4 = D
e.	5 = E
f.	6 = F
g.	7 = G
h.	8 = H
i.	9 = I
j.	10 = J
k.	11 = L 
l.	12 = M
m.	13 = N
n.	14 = O
o.	15 = P 
p.	16 = Q
q.	17 = R
r.	18 = S
s.	19 = T
t.	20 = U
u.	21 = V
v.	22 = X
w.	23 = Z
*/
package Exercicios_Scanner;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe os n�meros desejados (separados por espa�o):");
		String codigo = scanner.nextLine();
		String[] lista = codigo.split(" ");
		String resultado = "";
		for(int aux = 0; aux < lista.length; aux++){
			switch (lista[aux]) {
			case "1":
				resultado += "A";
				break;
			case "2":
				resultado += "B";
				break;
			case "3":
				resultado += "C";
				break;
			case "4":
				resultado += "D";
				break;
			case "5":
				resultado += "E";
				break;
			case "6":
				resultado += "F";
				break;
			case "7":
				resultado += "G";
				break;
			case "8":
				resultado += "H";
				break;
			case "9":
				resultado += "I";
				break;
			case "10":
				resultado += "J";
				break;
			case "11":
				resultado += "L";
				break;
			case "12":
				resultado += "M";
				break;
			case "13":
				resultado += "N";
				break;
			case "14":
				resultado += "O";
				break;
			case "15":
				resultado += "P";
				break;
			case "16":
				resultado += "Q";
				break;
			case "17":
				resultado += "R";
				break;
			case "18":
				resultado += "S";
				break;
			case "19":
				resultado += "T";
				break;
			case "20":
				resultado += "U";
				break;
			case "21":
				resultado += "V";
				break;
			case "22":
				resultado += "X";
				break;
			case "23":
				resultado += "Z";
				break;
			default:
				break;
			}
			resultado += " ";
		}
		System.out.println("As letras s�o: "+ resultado);
		scanner.close();
	}
	
}

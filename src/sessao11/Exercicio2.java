package sessao11;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercicio 2
		int somaPrincipal = 0, somaSecundaria = 0;
		int Inteiros[][] = new int[3][3];
		
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [ " + linha + " ][ " + coluna + " ]:");
				Inteiros[linha][coluna] = leia.nextInt();
			}

		}
		        somaPrincipal = Inteiros[0][0] + Inteiros[1][1] + Inteiros[2][2];
		        somaSecundaria = Inteiros[0][2] + Inteiros[1][1] + Inteiros[2][0];

		        System.out.println("Elementos da Diagonal Principal: " + Inteiros[0][0] + " " + Inteiros[1][1] + " " + Inteiros[2][2] );
				System.out.println("Elementos da Diagonal Secundária: " + Inteiros[0][2] + " " + Inteiros[1][1] + " " + Inteiros[2][0] );
				System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
				System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

	}

}

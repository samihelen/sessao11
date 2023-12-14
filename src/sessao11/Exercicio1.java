package sessao11;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercicio 1
		
		Scanner leia = new Scanner(System.in);

		int Numeros[] = { 7, 17, 27, 37, 47, 57, 67, 77, 87, 97 };
		int num, posicao;

		System.out.println("Digite o número que você deseja encontrar:");
		num = leia.nextInt();

		posicao = Arrays.binarySearch(Numeros, num);
		
		    if (posicao >= 0) {
				  System.out.println("O número " + num + " está localizado na posição: " + posicao);
			}

			else {
				System.out.println("Elemento não encontrado!");

			}

	}

}

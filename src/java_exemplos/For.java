package java_exemplos;

import java.util.Scanner;

/**
 *  Estrutura repetitiva "para"
 * 	Usar quando se sabe previamente a quantidade de repetições
 *	Ótimo para fazer contagens (progressiva ou regressiva)
 */	

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < number; i++) {
			int x = sc.nextInt();
			soma += x;
		}

		System.out.println(soma);

		sc.close();
	}

}

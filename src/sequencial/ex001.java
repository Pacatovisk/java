package sequencial;

import java.util.Scanner;

/*
	Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
	mensagem explicativa, conforme exemplos.
*/

public class ex001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);

		sc.close();
	}
}


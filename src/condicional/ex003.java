package condicional;

import java.util.Scanner;
/*
 *  Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
	ordem crescente ou decrescente.
 */
public class ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Are Multiple");
		} else {
			System.out.println("Not Multiple");
		}

		sc.close();
	}

}

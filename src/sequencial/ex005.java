package sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class ex005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int piece1 = sc.nextInt();
		double unitaryValue1 = sc.nextDouble();

		int piece2 = sc.nextInt();
		double unitaryValue2 = sc.nextDouble();

		double total = piece1 * unitaryValue1 + piece2 * unitaryValue2;

		System.out.printf("AMOUNT TO PAY: R$ %.2f", total);

		sc.close();
	}
}

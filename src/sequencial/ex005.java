package sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
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

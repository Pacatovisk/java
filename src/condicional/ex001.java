package condicional;

import java.util.Scanner;
/*
 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
 */
public class ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}

		sc.close();
	}
}

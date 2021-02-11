package condicional;

import java.util.Scanner;
/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
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

package sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 	Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	decimais.
 *
 */

public class ex004 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		double workHours = sc.nextDouble();
		double hourValue = sc.nextDouble();

		double salary = workHours * hourValue;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		sc.close();
	}
}

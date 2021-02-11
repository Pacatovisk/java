package sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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

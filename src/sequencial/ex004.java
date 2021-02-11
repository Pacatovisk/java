package sequencial;

import java.util.Locale;
import java.util.Scanner;

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

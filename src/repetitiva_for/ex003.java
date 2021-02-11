package repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double media = 0;
		double nota1;
		double nota2;
		double nota3;

		for (int i = 0; i < n; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}

		sc.close();

	}

}

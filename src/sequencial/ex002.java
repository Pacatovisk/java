package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();

		double area = Math.PI * (raio * raio);

		System.out.printf("A = %.4f ", area);

		sc.close();

	}

}

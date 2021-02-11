package repetitiva_for;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();

			if (n2 == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = n1 / n2;
				System.out.println(divisao);
			}

		}

		sc.close();
	}

}

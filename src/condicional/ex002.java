package condicional;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Pair number");
		} else {
			System.out.println("Odd number");
		}

		sc.close();
	}

}
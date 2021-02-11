package condicional;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Are Multiple");
		} else {
			System.out.println("Not Multiple");
		}

		sc.close();
	}

}

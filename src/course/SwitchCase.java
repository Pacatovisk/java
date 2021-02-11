package course;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		String dia = "";

		switch (number) {
		case 1:
			dia = "Dia da semana: domingo";
			break;

		case 2:
			dia = "Dia da semana: segunda";
			break;

		default:
			break;
		}
		
		System.out.println(dia);
		sc.close();

	}

}

package repetitiva_while;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (code != 4) {
			code = sc.nextInt();
			if (code == 1) {
				alcool += 1;
			}
			if (code == 2) {
				gasolina += 1;
			}
			if (code == 3) {
				diesel += 1;
			}
		}	
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
			
		sc.close();

	}

}

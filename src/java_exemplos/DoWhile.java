package java_exemplos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;

		try {
			do {
				System.out.print("Digite a temperatura em Celsius: ");
				double C = sc.nextDouble();
				double F = 9.0 * C / 5.0 + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
				System.out.println("Deseja repetir (s/n)?");
				resp = sc.next().charAt(0);
			} while (resp == 's');
		} catch (Exception exception){
			System.out.println("Inserir n�meros inteiros ou flutuantes! Letras n�o s�o permetidas!");
		}

		sc.close();
	}

}

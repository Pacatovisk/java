package java_exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		// Idioma dos Eua
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int b = sc.nextInt();
		double c = sc.nextDouble();
		float d = sc.nextFloat();
		
		System.out.println("Voc� digitou: " + a);
		System.out.println("Voc� digitou: " + b);
		System.out.println("Voc� digitou: " + c);
		System.out.println("Voc� digitou: " + d);

		sc.close();

	}
}

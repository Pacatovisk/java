package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double triangulo = 2 / (A * C);
		double circulo = Math.PI * C * C;
		double trapezio = (A * B) * C;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);

		sc.close();
	}
}

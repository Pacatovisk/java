package repetitiva_for;

import java.util.Scanner;
/*
 * Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
	segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
 */
public class ex004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();

			if (n2 == 0) {
				System.out.println("Divis�o impossivel");
			} else {
				double divisao = n1 / n2;
				System.out.println(divisao);
			}

		}

		sc.close();
	}

}

package course;

/**
 * Estrutura repetitiva "enquanto"
 * Recomendada quando não se sabe previamente a quantidade de repetições
 * 
 * Regra: Verdadeiro: executa e volta e F: pula fora
 */
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int soma = 0;
		while (number != 0) {
			soma += number;
			number = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}

}

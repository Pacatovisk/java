package java_exemplos;

import java.util.Scanner;

public class Function {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	//Fun��o para saber qual � o maior numero inteiro
     public static int max(int a, int  b, int c) { 
    	  int aux;
    	  
			if (a > b && a > c) {
				aux = a;
			}
			else if (b > a && b > c) {
				aux = b;
			}
			else {
				aux = c;
			}
			
		return  aux;
	}
     
     //Fun��o para imprimir o resultado
     public static void showResult(int value) {
    	 System.out.println("Higher = " + value);
     }
}

/* 
 * 								Fun��es 
 * 
 * Representam um processamento que possui um significado
 * 
 * -Math.sqrt(double)
 * -System.out.printn(string)
 * 
 * Principais vantagens: modulariza��o delega��o e reaproveitamento
 * 
 * - Dados de entrada e sa�da
 * 		- Fun��es podem receber dados de entrada (parametros ou argumentos)
 * 		- Fun��es podem ou n�o retornar uma sa�da 
 * 
 * - Em orienta��o a objetos, fun��es em classes recebem o nome de "m�todos"
 * 
 * 		double y = 25.0;
		double x = Math.sqrt(y);	
		System.out.println(x);
 */


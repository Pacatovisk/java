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
	
	//Função para saber qual é o maior numero inteiro
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
     
     //Função para imprimir o resultado
     public static void showResult(int value) {
    	 System.out.println("Higher = " + value);
     }
}

/* 
 * 								Funções 
 * 
 * Representam um processamento que possui um significado
 * 
 * -Math.sqrt(double)
 * -System.out.printn(string)
 * 
 * Principais vantagens: modularização delegação e reaproveitamento
 * 
 * - Dados de entrada e saída
 * 		- Funções podem receber dados de entrada (parametros ou argumentos)
 * 		- Funções podem ou não retornar uma saída 
 * 
 * - Em orientação a objetos, funções em classes recebem o nome de "métodos"
 * 
 * 		double y = 25.0;
		double x = Math.sqrt(y);	
		System.out.println(x);
 */


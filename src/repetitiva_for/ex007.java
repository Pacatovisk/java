package repetitiva_for;

import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i < n + 1; i++) {
			System.out.println(i +" "+i * i + " "+ i * i * i);
		}
		
		sc.close();
	}

}

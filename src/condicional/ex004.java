package condicional;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int startTime = sc.nextInt();
		int finalHour = sc.nextInt();

		int gameDuration = startTime - finalHour - 24;

		if (gameDuration > 1 || gameDuration < 24) {
			System.out.println("The game lasted " + Math.abs(gameDuration) + " hour(s)");
		}

		sc.close();
	}
}

package condicional;

import java.util.Scanner;
/*
 *  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
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

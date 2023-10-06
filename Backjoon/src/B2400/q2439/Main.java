package B2400.q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 1; i <= x; i++) {
			for (int j = x - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

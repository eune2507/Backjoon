package B2400.q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = x; i > 0; i--) {
			for (int j = x - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int z = i; z > 0; z--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

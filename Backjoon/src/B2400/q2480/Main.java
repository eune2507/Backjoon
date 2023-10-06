package B2400.q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		sc.close();
		int price = 0;

		if (a1 == a2 && a1 == a3) {
			price = 10000 + a1 * 1000;
			System.out.print(price);
		} else if (a1 == a2 && a1 != a3) {
			price = 1000 + a1 * 100;
			System.out.print(price);
		} else if (a1 == a3 && a1 != a2) {
			price = 1000 + a1 * 100;
			System.out.print(price);
		} else if (a2 == a3 && a2 != a1) {
			price = 1000 + a2 * 100;
			System.out.print(price);
		} else if (a1 != a2 && a1 != a3 && a2 != a3) {
			if (a1 > a2 && a1 > a3) {
				price = a1 * 100;
				System.out.print(price);
			} else if (a2 > a1 && a2 > a3) {
				price = a2 * 100;
				System.out.print(price);
			} else if (a3 > a1 && a3 > a2) {
				price = a3 * 100;
				System.out.print(price);
			}
		}

	}

}

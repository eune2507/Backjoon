package B25300.q25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		int N = sc.nextInt();
		long price = 0;
		
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			int b = sc.nextInt();
			price += a * b;
		}
		sc.close();

		if (X == price) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}

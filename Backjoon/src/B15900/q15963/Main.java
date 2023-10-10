package B15900.q15963;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		if (A == B) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

	}

}

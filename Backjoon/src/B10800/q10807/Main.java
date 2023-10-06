package B10800.q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ar[] = new int[N];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		sc.close();
		int y = 0;
		for (int i = 0; i < ar.length; i++) {
			if (x == ar[i]) {
				y++;
			}
		}
		System.out.print(y);

	}

}

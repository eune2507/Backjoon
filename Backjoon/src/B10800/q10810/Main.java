package B10800.q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] ar = new int[N];
		for (int t = 0; t <= (N - 1); t++) {
			ar[t] = 0;
		}
		for (int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			for (int j = a; j <= b; j++) {
				ar[j - 1] = c;
			}
			if (i == M) {
				for (int x = 0; x < ar.length; x++) {
					System.out.print(ar[x] + " ");
				}
			}
		}

		sc.close();

	}

}

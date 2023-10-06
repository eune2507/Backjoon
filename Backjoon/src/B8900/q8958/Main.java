package B8900.q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strX = new String[N];

		for (int i = 0; i < strX.length; i++) {
			strX[i] = sc.next();
		}
		sc.close();

		int sum = 0;
		int count = 1;
		// 01 12 23 34 45 56 비교하기
//		for (int i = 0; i < strX.length; i++) {
//			for (int j = 0; j < strX[i].length(); j++) {
//				int z = j + 1;
//				if (z != strX[i].length()) {
//					if (strX[i].charAt(j) == 'O' && strX[i].charAt(z) == 'O') {
//						System.out.println("i = " + i + " j = " + j + " z = " + z);
//					}
//				}
//			}
//		}

		for (int i = 0; i < strX.length; i++) {
			for (int j = 0; j < strX[i].length(); j++) {
				if (strX[i].charAt(j) == 'X') {
					count = 1;
				} else {
					sum += count++;

				}
				System.out.println(sum);
				sum = 0;
				count = 1;

			}
		}
	}
}

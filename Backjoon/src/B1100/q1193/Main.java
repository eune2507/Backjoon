package B1100.q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		// 1 (1 2) (3 2 1) (1 2 3 4) (5 4 3 2 1) (1 2 3 4 5 6) (7 6 5 4 3 2 1)
		// 1 (2 1) (1 2 3) (4 3 2 1) (1 2 3 4 5) (6 5 4 3 2 1) (1 2 3 4 5 6 7)

		// 1 /2 3/ 4 5 6/ 7 8 9 10/ 11 12 13 14 15 /
		// 9번 -1 8 -2 6 -3 3 -4 -1
		// 짝수번째 분자가 1부터시작, 홀수번째 분모가 1부터 시작
		int sum = 0;
		int i, j;
		for (i = 1; X - sum > 0; i++) {
			sum += i;
		}
		if (X - sum <= 0) {
			sum = sum-X+1;
			--i;
			if (i % 2 == 0) {
				for (j = 1; j <=i-sum; j++) {
				}
				System.out.print(j + "/" +sum );
			} else {
				for (j = 1; j <=i-sum; j++) {
				}
				System.out.print(sum + "/" +j );
			}
		}
	}
}

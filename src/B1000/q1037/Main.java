package B1000.q1037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] num = new int[N];
		for ( int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		if(N==1) {
			System.out.print(num[0]*num[0]);
		} else {
			System.out.print(num[0]*num[N-1]);
		}

	}

}

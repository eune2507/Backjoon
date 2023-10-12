package B11000.q11050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		int A = 1;
		int B = 1;
		int C = 1;
		for(int i = 1; i<=N; i++) {
			A *= i;
		}
		for(int i = 1; i<=N-M; i++) {
			B *= i;
		}
		for(int i = 1; i<=M; i++) {
			C *= i;
		}
		int sol = A/(B*C);
		System.out.print(sol);

	}

}

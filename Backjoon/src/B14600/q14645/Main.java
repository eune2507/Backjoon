package B14600.q14645;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int sum = K;
		for(int i = 0; i <N; i++) {
			sum += sc.nextInt();
			sum -= sc.nextInt();
			if (i+1==N) {
				sc.close();
				System.out.print("비와이");
			}
		}

	}

}

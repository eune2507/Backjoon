package B8300.q8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i<=N; i++) {
			sum += i;
		}
		System.out.print(sum);

	}

}

package B1000.q1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int N = 64;
		int count = 0;
		while(X>0) {
			if(N>X) {
				N = N/2;
			} else {
				X = X-N;
				count++;
			}
		}
		System.out.print(count);

	}

}

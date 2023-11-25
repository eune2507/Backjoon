package B11000.q11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ar [] = new int[N];
		for(int i = 0; i < ar.length ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			ar[i] = A+B;
		}
		sc.close();
		for(int i = 0; i < ar.length; i++) {
			System.out.println("Case #"+(i+1)+": "+ar[i]);
		}

	}

}

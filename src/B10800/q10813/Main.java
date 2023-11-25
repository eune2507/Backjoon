package B10800.q10813;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int ar [] = new int[N];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (i+1);
		}
		for(int i = 0; i < M; i++) {
			int trans1 = sc.nextInt();
			int trans2 = sc.nextInt();
			
			int transAr = ar[trans1-1];
			ar[trans1-1] = ar[trans2-1];
			ar[trans2-1] = transAr;
			
		}
		sc.close();
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}

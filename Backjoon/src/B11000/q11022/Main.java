package B11000.q11022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ar [] = new int[N];
		int arA [] = new int[N];
		int arB [] = new int[N];
		for(int i = 0; i < ar.length ; i++) {
			arA[i] = sc.nextInt();
			arB[i] = sc.nextInt();
			ar[i] = arA[i] + arB[i];
		}
		sc.close();
		for(int i = 0; i < ar.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arA[i]+" + "+arB[i]+" = "+ar[i]);
		}

	}

}
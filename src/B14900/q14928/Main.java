package B14900.q14928;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		long X = 20000303;
		for(int i =0; i<N.length(); i++) {
			X = (X*10 + (N.charAt(i)-'0'))%20000303;
		}
		sc.close();
		System.out.println(X);
	}

}

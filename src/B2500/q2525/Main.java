package B2500.q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int pM = sc.nextInt();
		
		sc.close();
		
		if(M+pM>=60) {
			H = H+(M+pM)/60;
			M = (M+pM)%60;
		} else {
			M = M+pM;
		}
		if (H>=24) {
			H = H-24;
		}
		System.out.print(H+" "+M);
		
	}

}

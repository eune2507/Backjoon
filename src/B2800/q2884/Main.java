package B2800.q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		if(M-45<0) {
			H = H-1;
			M = M+15;
		} else {
			M = M-45;
		}
		if(H<0) {
			H = H+24;
		}
		System.out.print(H+" "+M);

	}

}

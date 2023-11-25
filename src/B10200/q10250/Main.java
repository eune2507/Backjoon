package B10200.q10250;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			String X;
			
			int A = N%H;
			if(A==0) {
				A = H;
			}
			int B = N/H;
			if(A!=H) {
				B++;
			} 
			if (B<10){
				X = A+"0"+B;
			} else {
				X = A+""+B;
			}
			System.out.println(X);
		}
		sc.close();
	}

}

package B2500.q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		int mul = A*B*C;
		String X = String.valueOf(mul);
		int num [] = new int[10];
		
		for(int i = 0; i<X.length();i++) {
			num[Character.getNumericValue(X.charAt(i))]++;
		}
		
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}

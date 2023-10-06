package B10900.q10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A==0) {
				sc.close();
				break;
			}
			System.out.println(A+B);
		}

	}

}

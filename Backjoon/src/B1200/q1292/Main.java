package B1200.q1292;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		
		int sum = 0;
		int count = 0;
		for(int i = 1; i<=b; i++) {
			for(int j = 1; j<=i; j++) {
				count++;
				
				if(a<=count && count<=b) {
					sum += i;
				}
			}
		}
		
		
		System.out.print(sum);

	}

}

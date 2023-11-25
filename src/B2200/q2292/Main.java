package B2200.q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		// 1
		// 2 3 4 5 6 7
		// 8 9 10 11 12 13   14 15 16 17 18 19
		// 20 21 22 23 24 25 26 27 28 29 30 31   32 33 34 35 36 37 
		// 1 6 12 18 24 30 > 2번째부터 6씩 증가하는 등차수열 
		// 1 2-7(6) 8-19(12) 20-37(18) 38-61(24) 
		// 1 + 6(d-1) d 는 지나는 갯수
		// S = 6d - 5 >> 1 6 12 18 24 
		// S+5=6d    	d = (S+5)6 	
		
		// 1 / 1+1 1+6*1  / 1+1+6*1   1+6*1+6*2 / 1+1+6*1+6*2   1+6*1+6*2+6*3
		int a = 1; 	// 시작범위
		int b = 1;	// 끝범위
		
		if (x==1) {
			System.out.print(1);
		}
		if (x>=2) {
			for (int i = 2; ;i++) {
				b = b + 6*(i-1);
				a = b - 6*(i-1) + 1;
				if (x>=a && x<=b) {
					System.out.print(i);
					break;
				}
			}
		}
	}

}

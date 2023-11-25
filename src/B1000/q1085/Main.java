package B1000.q1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		// 1. ( X, 0 ) 거리
		// 2. ( 0, Y ) 거리
		// 3. ( W, 0 ) 거리
		// 4. ( 0, H ) 거리
		
		int xzero = x;
		int yzero = y;
		int xtow = w-x;
		int ytoh = h-y;
		
		System.out.println(Math.min(xzero, Math.min(yzero, Math.min(xtow, ytoh))));
		
	}

}

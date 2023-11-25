package B3000.q3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 킹 퀸 룩 비숍 나이트 폰
		// 1 1 2 2 2 8
		
		Scanner sc = new Scanner(System.in);
		int ar [] = new int[6];
		for(int i =0 ; i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(1-ar[0]+" ");
		System.out.print(1-ar[1]+" ");
		System.out.print(2-ar[2]+" ");
		System.out.print(2-ar[3]+" ");
		System.out.print(2-ar[4]+" ");
		System.out.print(8-ar[5]+" ");

	}
}
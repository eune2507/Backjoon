package B1100.p1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rgb[][] = new int[N][3];

		for (int i = 0; i < rgb.length; i++) {
			for (int k = 0; k < rgb[i].length; k++) {
				rgb[i][k] = sc.nextInt();
			}
		}
		sc.close();
		int sum = 0;
		
	}

}

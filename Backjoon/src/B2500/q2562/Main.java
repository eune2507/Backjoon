package B2500.q2562;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[9];
		int soar [] = new int[9];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		soar = Arrays.copyOf(ar, 9);
		Arrays.sort(soar);
		System.out.println(soar[8]);
		for(int i = 0; i<ar.length; i++) {
			if(soar[8] == ar[i]) {
				System.out.println(i+1);
			}
		}
	}
}

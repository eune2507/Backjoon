package B10800.q10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ar [] = new int[N];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(ar);
		System.out.print(ar[0]+" "+ar[N-1]);

	}

}

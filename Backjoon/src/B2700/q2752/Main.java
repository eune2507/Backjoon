package B2700.q2752;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int ar [] = new int[3];
		ar[0]=a;
		ar[1]=b;
		ar[2]=c;
		Arrays.sort(ar);
		System.out.print(ar[0]+" "+ar[1]+" "+ar[2]);
		

	}

}

package B2700.q2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ar1 [][] = new int[N][M];
		int ar2 [][] = new int[N][M];
		
		for(int i = 0; i<ar1.length; i++) {
			for (int k = 0; k <ar1[i].length; k++)	{
				ar1[i][k] = sc.nextInt();
			}
		}
		for(int i = 0; i<ar1.length; i++) {
			for (int k = 0; k <ar1[i].length; k++)	{
				ar2[i][k] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i<ar1.length; i++) {
			for (int k = 0; k <ar1[i].length; k++)	{
				System.out.print(ar1[i][k]+ar2[i][k]+" ");
			}
			System.out.println();
		}

	}

}

package B5500.q5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[30];
		
		for(int i = 0; i<ar.length; i++)	{
			for(int k = 1; k<=28; i++) {
				if((i+1)==sc.nextInt()) {
					ar[i]++;
				}
			}
		}
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		
	}

}

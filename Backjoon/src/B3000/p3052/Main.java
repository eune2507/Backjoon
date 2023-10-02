package B3000.p3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 10;
		int [] ar = new int[10];
		
		for(int i = 0; i <ar.length; i++) {
			ar[i] = sc.nextInt()%42;
		}
		for(int i = 0; i<ar.length; i++) {
			for(int j = i; j<ar.length; j++) {
				if(ar[i]==ar[j] && i != j) {
					count--;
					break;
				}
			}
		}
		
		if(count == 0) {
			count = 1;
		}
		sc.close();
		System.out.println(count);
		

	}

}

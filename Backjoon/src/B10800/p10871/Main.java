package B10800.p10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int [] iar = new int[N];
		
		
		for(int i = 0; i<iar.length; i++) {
			iar[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i<iar.length; i++) {
			if(iar[i] < X) {
				System.out.print(iar[i]+" ");
			} 
		}

	}

}

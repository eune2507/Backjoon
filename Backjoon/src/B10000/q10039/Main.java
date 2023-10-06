package B10000.q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] iar = new int[5];
		
		for(int i = 0; i < iar.length; i++) {
			iar[i] = sc.nextInt();
			if(iar[i] <=40) {
				iar[i] = 40;
			}
		}
		sc.close();
		
		int sum = 0;
		for(int i = 0; i<iar.length; i++) {
			sum += iar[i];
		}
		int avg = sum/5;
		System.out.print(avg);
		

	}

}

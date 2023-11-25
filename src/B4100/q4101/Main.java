package B4100.q4101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0) {
				break;
			}
			if(a>b) {
				System.out.println("Yes");
			} else if (a<=b){
				System.out.println("No");
			}
			
		}
		sc.close();

	}

}

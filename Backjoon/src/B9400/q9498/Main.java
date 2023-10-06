package B9400.q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		if(x>=90) {
			System.out.print('A');
		} else if(x<90 && x>=80) {
			System.out.print('B');
		} else if(x<80 && x>=70) {
			System.out.print('C');
		} else if(x<70 && x>=60) {
			System.out.print('D');
		} else {
			System.out.print('F');
		}

	}

}

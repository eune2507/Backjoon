package B1100.q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();


		int a = 0;
		int b = 0;
		int sum = 0;
		int count = 0;

		if (num / 10 == 0) {
			a = 0;
			b = num;
		} else {
			a = num / 10;
			b = num % 10;
		}

		for (;;) {
			count++;
			sum = a + b;
			
			if(sum>=10) {
				a = b;
				b = sum%10;
			} else {
				a = b;
				b = sum;
			}
			sum = a*10+b;
			if (sum == num) {
				break;
			}
			
		}
		System.out.print(count);
	}

}

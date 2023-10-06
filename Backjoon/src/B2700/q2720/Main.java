package B2700.q2720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int money [] = new int[N];
		
		for (int i = 0; i < money.length; i++) {
			money[i] = sc.nextInt();
		}
		
		// 0.25 0.10 0.05 0.01
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		for(int i = 0; i < money.length; i++) {
			if(money[i]>=25) {
				quarter = money[i]/25;
				System.out.print(quarter+" ");
			} else {
				System.out.print(0+" ");
			}
			if((money[i]- 25*quarter)>=10) {
				dime = (money[i]-25*quarter)/10;
				System.out.print(dime+" ");
			} else {
				System.out.print(0+" ");
			}
			if((money[i] - 25*quarter - 10*dime)>=5) {
				nickel =  (money[i] - 25*quarter - 10*dime)/5;
				System.out.print(nickel+" ");
			} else {
				System.out.print(0+" ");
			}
			if((money[i] - 25*quarter - 10*dime - 5*nickel) >=1) {
				penny = money[i] - 25*quarter - 10*dime - 5*nickel;
				System.out.print(penny+" ");
			} else {
				System.out.print(0+" ");
			}
			quarter = 0; dime = 0; nickel = 0; penny = 0;
			System.out.println();
		}
		sc.close();
	}

}

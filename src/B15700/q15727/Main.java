package B15700.q15727;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();
		int Lx = L/5;
		if(L%5!=0) {
			Lx += 1;
		}
		System.out.print(Lx);	
	}
}

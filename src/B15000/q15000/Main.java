package B15000.q15000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		if(str.charAt(0)>96) {
			System.out.println(str.toUpperCase());
		} else {
			System.out.println(str.toLowerCase());
		}

	}

}

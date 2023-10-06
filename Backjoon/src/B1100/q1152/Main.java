package B1100.q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strX = str.split(" ");

		if (strX.length != 0) {
			if (strX[0] == "") {
				System.out.print(strX.length - 1);
			} else {
				System.out.print(strX.length);
			}

		}else {
			System.out.print(0);
		}
		sc.close();

	}

}

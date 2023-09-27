package B9000.p9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		String[] strX = new String[x];
		for (int i = 0; i < x; i++) {
			strX[i] = sc.next();
		}
		sc.close();

		int a = 0;
		int b = 0;
		for (int i = 0; i < x; i++) {
			if (strX[i].charAt(0) != ')') {
				for (int j = 0; j < strX[i].length(); j++) {
					
						if (strX[i].charAt(j) == '(') {
							a += 1;
						}
						if (strX[i].charAt(j) == ')') {
							b += 1;
						}
						if (b>a) {
							System.out.println("NO");
							a = 0;
							b = 0;
							break;
						}
						if (strX[i].length() - 1 == j) {
							if (a == b) {
								System.out.println("YES");
							} else {
								System.out.println("NO");
							}
							a = 0;
							b = 0;
						}
				} 		
			} else { System.out.println("NO");}	
		}
	}
}

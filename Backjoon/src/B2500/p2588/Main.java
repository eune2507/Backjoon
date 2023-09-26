<<<<<<< HEAD
package B2500.p2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
//		int a1 = a/100;
		int b1 = b/100;
		
//		int a2 = (a-a1*100)/10;
		int b2 = (b-b1*100)/10;
		
//		int a3 = a-a1*100-a2*10;
		int b3 = b-b1*100-b2*10;
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.print(a*b);;
		
		//case2 깃허브 참고
	}

}
=======
package B2500.p2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
//		int a1 = a/100;
		int b1 = b/100;
		
//		int a2 = (a-a1*100)/10;
		int b2 = (b-b1*100)/10;
		
//		int a3 = a-a1*100-a2*10;
		int b3 = b-b1*100-b2*10;
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.print(a*b);;
		
		//case2 깃허브 참고
	}

}
>>>>>>> branch 'master' of https://github.com/eune2507/Backjoon.git

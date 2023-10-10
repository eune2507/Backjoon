package B15900.q15964;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static BigInteger fx(BigInteger num1, BigInteger num2) {
		BigInteger result = num1.add(num2).multiply(num1.subtract(num2));
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		sc.close();
		System.out.print(fx(A,B));
		

	}

}

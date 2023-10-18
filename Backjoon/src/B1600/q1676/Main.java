package B1600.q1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger pac = new BigInteger("1");
		for (int i = 1; i <= N; i++) {
			BigInteger p = new BigInteger(Integer.toString(i));
			pac = pac.multiply(p);
		}
		String str = pac.toString();
		int a = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '0') {
				a++;
			} else {
				break;
			}
		}
			System.out.print(a);

	}

}

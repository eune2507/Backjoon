package B1200.q1247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<3; i++) {
			int N = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			BigInteger zero = new BigInteger("0");
			for(int j = 0; j<N; j++) {
				BigInteger num = new BigInteger(br.readLine());
				sum = sum.add(num);
			}
			if(sum.compareTo(zero) == 1) {
				sb.append("+\n");
			} else if(sum.compareTo(zero) == -1) {
				sb.append("-\n");
			} else {
				sb.append("0\n");
			}
		}
		System.out.println(sb);

	}

}

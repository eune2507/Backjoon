package B1000.q1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int zero;
	static int one;
	static int sum;
	public static void fibo(int num) {
		zero = 1;
		one = 0;
		sum = 1;
		for(int i = 0; i<num; i++) {
			zero = one;
			one = sum;
			sum = zero + one;
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int te [] = new int[T];
		for(int i = 0; i<T; i++ ) {
			te[i] = Integer.parseInt(br.readLine());
			fibo(te[i]);
			sb.append(zero+" "+one+"\n");
		}
		System.out.print(sb);
		
	}

}

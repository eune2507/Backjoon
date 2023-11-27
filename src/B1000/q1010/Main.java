package B1000.q1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int ar [][] = new int[31][31];
	public static int number(int num1, int num2) {
		if(ar[num1][num2] > 0) {
			return ar[num1][num2];
		} else if(num1==num2 | num2==0) {
			return ar[num1][num2] = 1;
		} else {
			return ar[num1][num2] = number(num1-1,num2-1) + number(num1-1,num2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<T; i++) {
			String inp = br.readLine();
			String num [] = inp.split(" ");
			int N = Integer.parseInt(num[0]);
			int M = Integer.parseInt(num[1]);
			
			int result = number(M,N);
			sb.append(result+"\n");
		}
		System.out.println(sb);

	}

}

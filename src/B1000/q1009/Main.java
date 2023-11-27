package B1000.q1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			String inp = br.readLine();
			String num [] = inp.split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			int result = 1;
			for(int j = 1; j<=B; j++) {
				result = result * A % 10;
			}
			if(result == 0) {
				result = 10;
			}
			sb.append(result+"\n");
		}
		System.out.println(sb);
		

	}

}

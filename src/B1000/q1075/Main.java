package B1000.q1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		int device = N % 100;
		int X = N-device;
		int sol1 = X%F;
		int result;
		if(sol1 == 0) {
			result = X;
		}
		result = X + sol1;
		
		System.out.println(sol1 +" "+result);

	}

}

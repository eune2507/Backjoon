package B1100.q1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		String num [] = inp.split(" ");
		int ar [] = new int[num.length];
		for(int i = 0; i<num.length; i++) {
			ar[i] = Integer.parseInt(num[i]);
		}
		
		int X = 1;
		int count = 0;
		
		while(true) {
			for(int i = 0; i<ar.length; i++) {
				if(X%ar[i] == 0) {
					count++;
				}
			}
			if(count>=3) {
				System.out.print(X);
				return;
			}
			count= 0;
			X++;
		}

	}

}

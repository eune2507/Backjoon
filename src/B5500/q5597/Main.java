package B5500.q5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean [] ar = new boolean[31];
		
		for(int i = 0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			ar[n] = true;
		}
		for(int i = 1; i<31; i++) {
			if(ar[i]!=true) {
				System.out.println(i);
			}
		}
	
	}

}

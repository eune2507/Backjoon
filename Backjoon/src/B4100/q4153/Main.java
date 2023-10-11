package B4100.q4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			String ar [] = str.split(" ");
			int A = Integer.parseInt(ar[0]);
			int B = Integer.parseInt(ar[1]);
			int C = Integer.parseInt(ar[2]);
			if(A==0) {
				break;
			}
			
			if(A>B && A>C) {
				if(Math.pow(A, 2)==Math.pow(B,2)+Math.pow(C, 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if(B>A && B>C) {
				if(Math.pow(B, 2)==Math.pow(A,2)+Math.pow(C, 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if(C>A && C>B) {
				if(Math.pow(C, 2)==Math.pow(A,2)+Math.pow(B, 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
			
		}
	}

}

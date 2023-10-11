package B1100.q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		
		int num [] = new int[26];
		for(int i = 0; i<X.length(); i++) {
			if(X.charAt(i)<=90) {
				num[X.charAt(i)-65]++;
			} else {
				num[X.charAt(i)-97]++;
			}
		}
		
		int max = -1;
		char Y = '?';
		for(int i = 0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
				Y = (char) (i+65);
			} else if (num[i] == max) {
				Y = '?';
			}
		}
		System.out.print(Y);
		
	}

}

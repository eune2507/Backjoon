package B2600.q2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String ar [] = num.split(" ");
		int numar [] = new int[2];
		numar[0] = Integer.parseInt(ar[0]);
		numar[1] = Integer.parseInt(ar[1]);
		int a = 0;
		int b = 0;
		if(numar[0] > numar[1]) {
			for(int i = 1; i<=numar[1]; i++) {
				if(numar[0]%i==0 && numar[1]%i==0) {
					a = i;
				}
			}
		} else {
			for(int i = 1; i<=numar[0]; i++) {
				if(numar[0]%i==0 && numar[1]%i==0) {
					a = i;
				}
			}
		}
		
		b = numar[0] * numar[1] / a;
		System.out.println(a);
		System.out.println(b);
	}

}

package B10700.q10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ar [] = new int[N];
		int j = 0;
		for(int i = 0; i<ar.length; i++	) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				j--;
				ar[j] = num;
			} else {
				ar[j] = num;
				j++;
			}
		}
		int sum = 0;
		for(int i = 0; i<ar.length; i++) {
			sum += ar[i];
		}
		System.out.print(sum);
	}

}

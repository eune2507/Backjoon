package B2100.q2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int head = 1;
		int tail = N;
		int ar [] = new int[2*N];
		for(int i = 1; i<=N; i++) {
			ar[i] = i;
		}
		while(N-- > 1) {
			head++;
			ar[tail+1]=ar[head];
			tail++;
			head++;
		}
		System.out.println(ar[head]);
	}

}

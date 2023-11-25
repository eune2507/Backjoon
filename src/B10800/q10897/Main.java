package B10800.q10897;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int D = Integer.parseInt(br.readLine());
		int ar [] = new int[D];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 1;
		int d = 1;
		System.out.println(ar[0]);
		for(int i = 1; i<D; i++) {
			d = i*d;
			if(ar[i]!=1) {
				sum += d+ar[i]-1;
			} else {
				sum += d;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

}

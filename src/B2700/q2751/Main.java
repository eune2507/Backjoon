package B2700.q2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int ar [] = new int[N];
		for(int i = 0; i<ar.length; i++	) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(ar);
		for(int i = 0; i<ar.length; i++) {
			bw.write(Integer.toString(ar[i])+"\n");
		}
		bw.flush();
		bw.close();
	}

}

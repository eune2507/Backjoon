package B1500.q1546;

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
		double sum = 0;
		String X = br.readLine();
		String arX []= X.split(" ");
		int ar [] = new int[N];
		for(int i = 0; i<N; i++) {
			ar[i] = Integer.parseInt(arX[i]);
		}
		int arso [] = ar.clone();
		Arrays.sort(arso);
		for(int i = 0; i<ar.length; i++) {
			sum += (double)ar[i]/arso[N-1]*100;
		}
		double avg = (double)sum/N;
		bw.write(Double.toString(avg));
		bw.flush();
		bw.close();
		br.close();
		
	}

}

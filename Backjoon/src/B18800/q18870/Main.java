package B18800.q18870;

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
		String str = br.readLine();
		String ar [] = str.split(" ");
		int numar [] = new int[N];
		for(int i = 0; i < numar.length; i++) {
			numar[i] = Integer.parseInt(ar[i]);
		}
		Arrays.sort(numar);
		numar = Arrays.stream(numar).distinct().toArray();
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j<numar.length; j++) {
				if(Integer.parseInt(ar[i])==numar[j]) {
					bw.write(j+" ");
				}
			}
		}
		bw.flush();
		bw.close();
	}

}

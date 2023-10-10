package B11700.q11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		for(int i = 0; i<N; i++) {
			sum += Integer.parseInt(str.substring(i,i+1));
		}
		br.close();
		System.out.print(sum);

	}

}

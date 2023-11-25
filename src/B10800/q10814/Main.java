package B10800.q10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[][] age = new String[N][2];
		int min = 200;
		int max = 0;
		for(int i = 0; i < age.length; i++) {
			age[i] = br.readLine().split(" ");
			if(min > Integer.parseInt(age[i][0])) {
				min = Integer.parseInt(age[i][0]);
			}
			if(max < Integer.parseInt(age[i][0])) {
				max = Integer.parseInt(age[i][0]);
			}
		}
		for(int i = min; i<=max; i++) {
			for(int j = 0; j<age.length; j++) {
				if(i==Integer.parseInt(age[j][0])) {
					sb.append(age[j][0]).append(" ").append(age[j][1]).append("\n");
				}
			}
		}
		System.out.print(sb);
	}

}

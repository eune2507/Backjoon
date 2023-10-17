package B11600.q11650;

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
		int ar [][] = new int [N][2];
		String str [] = new String[2];
		for(int i = 0; i<ar.length; i++) {
			str = br.readLine().split(" ");
			ar[i][0] = Integer.parseInt(str[0]);
			ar[i][1] = Integer.parseInt(str[1]);
		}
		Arrays.sort(ar,(ar_1, ar_2) ->{
			if(ar_1[0] == ar_2[0]) {
				return ar_1[1] - ar_2[1];
			}
			else {
				return ar_1[0] - ar_2[0];
			}
		});
		for(int i = 0; i<ar.length; i++) {
			for(int k = 0; k<ar[i].length; k++	) {
				bw.write(Integer.toString(ar[i][k])+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}

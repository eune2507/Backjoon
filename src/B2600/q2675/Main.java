package B2600.q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String ar [] = new String[T];
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			String strX = "";
			int R = Integer.parseInt(str.substring(0,1));
			String S = str.substring(2);
			for(int k = 0; k<S.length(); k++) {
				strX += S.substring(k,k+1).repeat(R);
			}
			ar[i] = strX;
		}
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}

package B1200.q1259;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean A = true;
		
		while(true) {
			String num = br.readLine();
			A = true;
			if(num.equals("0")) {
				br.close();
				break;
			}
			for(int i = 0; i <= num.length()/2; i++) {
				if(num.charAt(i)!= num.charAt(num.length()-1-i)) {
					A = false;
				}
			}
			if(A) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}

package B2700.q2744;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		char ar [] = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				ar[i] = Character.toUpperCase(str.charAt(i));
			} else {
				ar[i] = Character.toLowerCase(str.charAt(i));
			}
		}
		bw.write(ar);
		bw.flush();
		bw.close();
	}

}

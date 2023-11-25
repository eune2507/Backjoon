package B4900.q4999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i<str1.length(); i++) {
			if(str1.charAt(i)=='a') {
				count1++;
			}
		}
		for(int i = 0; i<str2.length(); i++) {
			if(str2.charAt(i)=='a') {
				count2++;
			}
		}
		if(count1>=count2) {
			bw.write("go");
		} else {
			bw.write("no");
		}
		bw.flush();
		bw.close();
	}

}

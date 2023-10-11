package B1000.q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nm = br.readLine();
		String nmar [] = nm.split(" ");
		int N = Integer.parseInt(nmar[0]);
		int M = Integer.parseInt(nmar[1]);
		
		int count = 0;
		String box [][] = new String[N][M];
		
		for(int i = 0; i<box.length; i++) {
			String X = br.readLine();
			for(int k = 0; k<box[i].length; k++) {
				box[i][k] = X.substring(k,k+1);
			}
		}
		
		for(int i = 0; i < box.length; i++) {
			for(int k = 0; k < box[i].length-2; k++) {
				
			}
		}
		System.out.print(count);
	}

}

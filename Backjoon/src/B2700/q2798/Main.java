package B2700.q2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String first = br.readLine();
		String firstar [] = first.split(" ");
		int N = Integer.parseInt(firstar[0]);
		int max = Integer.parseInt(firstar[1]);
		int num []= new int[N];
		String number = br.readLine();
		String numberar [] = number.split(" ");
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(numberar[i]);
		}
		

	}

}

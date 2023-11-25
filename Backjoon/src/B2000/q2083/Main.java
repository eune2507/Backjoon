package B2000.q2083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String person = br.readLine();
			if(person.equals("# 0 0")) {
				break;
			}
			String ar [] = person.split(" ");
			String age = null;
			if(Integer.parseInt(ar[1])>17|| Integer.parseInt(ar[2])>=80) {
				age = "Senior";
			} else {
				age = "Junior";
			}
			sb.append(ar[0]).append(" ").append(age).append("\n");
		}
		System.out.print(sb);
	}

}

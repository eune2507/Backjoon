package B5500.q5524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String [] name = new String [num];
		for(int i = 0; i < name.length; i++) {
			name[i] = br.readLine();
		}
		for(int i = 0; i < name.length; i++) {
			sb.append(name[i].toLowerCase()).append("\n");
		}
		System.out.println(sb);
	}

}

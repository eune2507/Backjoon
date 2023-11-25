package B1000.q1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		int check[] = new int[str[0].length()];

		for (int i = 0; i < str[0].length(); i++) {
			for (int j = 0; j < N; j++) {
				char A = str[0].charAt(i);
				if (str[j].charAt(i) == A) {
					check[i]++;
				}
			}
		}

		for (int i = 0; i < str[0].length(); i++) {
			if (check[i] == N) {
				System.out.print(str[0].charAt(i));
			} else {
				System.out.print("?");
			}
		}
	}

}

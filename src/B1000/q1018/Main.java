package B1000.q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		String NM[] = nm.split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		int inar[][] = new int[N][M];

		for (int i = 0; i < inar.length; i++) {
			String str = br.readLine();
			for (int j = 0; j < inar[i].length; j++) {
				if (str.charAt(j) == 'W') {
					inar[i][j] = 1;
				} else {
					inar[i][j] = 0;
				}

			}
		}
		
		int count = 0;
		int mincount = 32;
		while (true) {

			for (int x = 0; x < N - 7; x++) {

				for (int y = 0; y < M - 7; y++) {
					count = 0;
					for (int i = 0; i < 8; i += 2) {
						for (int j = 0; j < 8; j += 2) {
							if (inar[x][y] != inar[x + i][y + j]) {
								count++;
							}
						}
						for (int k = 1; k < 8; k += 2) {
							if (inar[x][y] == inar[x + i][y + k]) {
								count++;
							}
						}
					}
					for (int i = 1; i < 8; i += 2) {
						for (int j = 0; j < 8; j += 2) {
							if (inar[x][y] == inar[x + i][y + j]) {
								count++;
							}
						}
						for (int k = 1; k < 8; k += 2) {
							if (inar[x][y] != inar[x + i][y + k]) {
								count++;
							}
						}
					}

					if (count > 32) {
						count = 64 - count;
					}
					if (count < mincount) {
						mincount = count;
					}

				}
			}
			break;
		}
		
		System.out.print(mincount);
	}
}

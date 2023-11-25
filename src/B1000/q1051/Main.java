package B1000.q1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int num [][];
	public static int square(int N, int M) {
		int result = -1;
		int P = Math.min(N, M);
		for(int i = P; i>=1; i--) {
			for(int j = 0; j<=num.length-i; j++) {
				for(int z = 0; z<=num[j].length-i; z++) {
					int A = num[j][z];
					if(A ==num[j][z+i-1] && A ==num[j+i-1][z] && A == num[j+i-1][z+i-1]) {
						result = i * i;
						return result;
					}
				}
			}
		}
		result = 1;
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		// N x M 직사각형
		// 꼭짓점에 쓰여있는 수가 같은 가장 큰 정사각형 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		String fir [] = first.split(" ");
		int N = Integer.parseInt(fir[0]);
		int M = Integer.parseInt(fir[1]);
		num = new int[N][M];
		for(int i = 0; i<N; i++) {
			String inp = br.readLine();
			for(int j = 0; j<M; j++) {
				num[i][j] = Integer.parseInt(inp.substring(j,j+1));
			}
		}
		System.out.print(square(N,M));
		
	}

}

package B10800.q10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<N; i++) {
			int key = Integer.parseInt(st.nextToken());
			rank.put(key, rank.getOrDefault(key, 0)+1);
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer ss = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(ss.nextToken());
			sb.append(rank.getOrDefault(key, 0)).append(' ');
		}
		System.out.print(sb);

	}

}

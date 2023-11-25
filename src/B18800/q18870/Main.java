package B18800.q18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int origin [] = new int[N];
		int sort [] = new int[N];
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N; i++	) {
			sort[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sort);
		
		int num = 0;
		for(int j : sort) {
			if(!rank.containsKey(j)) {
				rank.put(j, num);
				num++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rank.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
		
	}

}

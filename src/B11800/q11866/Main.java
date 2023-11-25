package B11800.q11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Ministack {
	private int[] ar;
	private int pushX, popX, count;
	public Ministack() {
		ar = new int[1000];
		pushX = -1;
		popX = -1;
		count = 0;
	}

	public void push(int num) {
		ar[++pushX] = num;
	}

//	public int pop() {
//		if (topX == -1) {
//			return -1;
//		} else {
//			return ar[topX--];
//		}
//	}
	public int pop(int num) {
		for(;count<num;) {
			if(popX>=pushX) {
				popX = -1;
			}
			if(ar[++popX]!=0) {
				count++;
			} 
		}
		int result = ar[popX];
		ar[popX] = 0;
		count = 0;
		return result;
	}
}
public class Main {
	
	
	public static void main(String[] args) throws IOException{
		// 1~N 까지 스택에 넣기
		// count 로 움직이기
		// 스택이 비었으면 한칸 더가기 
		// N번 스택끝까지 가면 처음 0번으로 돌아오기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Ministack mini = new Ministack();
		String NK [] = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		for(int i = 1; i<=N; i++) {
			mini.push(i);
		}
		System.out.print("<");
		for(int i = 0; i < N; i++) {
			sb.append(mini.pop(K));
			if(i!=N-1) {
				sb.append(", ");
			} else {
				sb.append(">");
			}
		}
		System.out.print(sb);	
	}
}

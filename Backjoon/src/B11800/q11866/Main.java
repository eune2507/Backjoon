package B11800.q11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Ministack {
	private int[] ar;
	private int topX;
	private int count = 0;
	public Ministack() {
		ar = new int[1000];
		topX = -1;
	}

	public void push(int num) {
		ar[++topX] = num;
	}

//	public int pop() {
//		if (topX == -1) {
//			return -1;
//		} else {
//			return ar[topX--];
//		}
//	}
	public int pop(int num) {
		count = count + num - 1;
		
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
		for(int i = 1; i<N; i++) {
			mini.push(i);
		}
		
		
	}

}

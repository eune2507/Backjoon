package B10800.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class Ministack {
//	private int[] ar;
//	private int topX;
//
//	public Ministack() {
//		ar = new int[100000];
//		topX = -1;
//	}
//
//	public void push(int num) {
//		ar[++topX] = num;
//	}
//
//	public int pop() {
//		if (topX == -1) {
//			return -1;
//		} else {
//			return ar[topX--];
//		}
//	}
//
//	public int size() {
//		return topX + 1;
//	}
//
//	public int empty() {
//		if (topX == -1) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
//
//	public int top() {
//		if (topX == -1) {
//			return -1;
//		} else {
//			return ar[topX];
//		}
//	}
//}
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Ministack ministack = new Ministack();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			String str = br.readLine();
			if(str.contains("push")) {
				ministack.push(Integer.parseInt(str.substring(5)));
			} else if(str.contains("top")) {
				System.out.println(ministack.top());
			} else if(str.contains("size")) {
				System.out.println(ministack.size());
			} else if(str.contains("empty")) {
				System.out.println(ministack.empty());
			} else if(str.contains("pop")) {
				System.out.println(ministack.pop());
			}
		}
		br.close();

	}

}

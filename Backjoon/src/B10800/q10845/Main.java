package B10800.q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Que {
	private int num;
	private int topY;
	private int topX;
	private int[] ar;

	public Que() {
		ar = new int[10000];
		topX = -1;
		topY = 0;
	}

	public void push(int num) {
		ar[++topX] = num;
	}

	public int pop() {
		if (ar[topY] != 0) {
			return ar[topY++];
		} else {
			return -1;
		}
	}

	public int size() {
		return topX - topY + 1;
	}

	public int empty() {
		if (topX == -1 || topY > topX) {
			return 1;
		} else {
			return 0;
		}
	}

	public int front() {
		if (topX == -1 | topY > topX) {
			return -1;
		} else {
			return ar[topY];
		}
	}

	public int back() {
		if (topX == -1 | topY > topX) {
			return -1;
		} else {
			return ar[topX];
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Que que = new Que();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (str.contains("push")) {
				que.push(Integer.parseInt(str.substring(5)));
			} else if (str.contains("pop")) {
				System.out.println(que.pop());
			} else if (str.contains("size")) {
				System.out.println(que.size());
			} else if (str.contains("empty")) {
				System.out.println(que.empty());
			} else if (str.contains("front")) {
				System.out.println(que.front());
			} else if (str.contains("back")) {
				System.out.println(que.back());
			}
		}
		br.close();
	}

}

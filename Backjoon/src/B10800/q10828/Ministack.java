package B10800.q10828;

public class Ministack {
	private int[] ar;
	private int topX;

	public Ministack() {
		ar = new int[10000];
		topX = -1;
	}

	public void push(int num) {
		ar[++topX] = num;
	}

	public int pop() {
		if (topX == -1) {
			return -1;
		} else {
			return ar[topX--];
		}
	}

	public int size() {
		return topX + 1;
	}

	public int empty() {
		if (topX == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (topX == -1) {
			return -1;
		} else {
			return ar[topX];
		}
	}
}

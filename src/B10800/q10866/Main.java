package B10800.q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fifo {
	private int topF;
	private int topB;
	private int ar [];
	
	public Fifo() {
		ar = new int[10000];
		topF = 4999;
		topB = 4999;
	}	
	public void pushF(int num) {
		if(topF == topB && ar[topF]==0) {
			ar[topF] = num;
		} else if (ar[topF]!=0){
			ar[++topF] = num;
		}
	}
	public void pushB(int num) {
		if(topF == topB && ar[topB]==0) {
			ar[topB] = num;
		} else if(ar[topB]!=0) {
			ar[--topB]=num;
		}
	}
	public int popF() {
		if(topF == topB && ar[topF]!=0) {
			int pop = ar[topF];
			ar[topF] = 0;
			return pop;
		} else if(ar[topF]!=0) {
			int pop = ar[topF];
			ar[topF--] = 0;
			return pop;
		} else {
			return -1;
		}
	}
	public int popB() {
		if(topF == topB && ar[topB]!=0) {
			int pop = ar[topB];
			ar[topB] = 0;
			return pop;
		} else if(ar[topB]!=0) {
			int pop = ar[topB];
			ar[topB++] = 0;
			return pop;
		} else {
			return -1;
		}
	}
	public int size() {
		if(topF == topB && ar[topF]==0) {
			return 0;
		} else {
			return topF-topB+1;
		}
	}
	public int empty() {
		if(size()==0) {
			return 1;
		} else {
			return 0;
		}
	}
	public int front() {
		if(ar[topF]!=0) {
			return ar[topF];
		} else {
			return -1;
		}
	}
	public int back() {
		if(ar[topB]!=0) {
			return ar[topB];
		} else {
			return -1;
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Fifo fifo = new Fifo();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			String str = br.readLine();
			if(str.contains("push_front")){
				fifo.pushF(Integer.parseInt(str.substring(11)));
			} else if(str.contains("push_back")) {
				fifo.pushB(Integer.parseInt(str.substring(10)));
			} else if(str.contains("pop_front")) {
				System.out.println(fifo.popF());
			} else if(str.contains("pop_back")) {
				System.out.println(fifo.popB());
			} else if(str.contains("size")) {
				System.out.println(fifo.size());
			} else if(str.contains("empty")) {
				System.out.println(fifo.empty());
			} else if(str.contains("front")) {
				System.out.println(fifo.front());
			} else if(str.contains("back")) {
				System.out.println(fifo.back());
			}
		}
		br.close();
		
	}

}

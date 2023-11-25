package B2700.q2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ex = br.readLine();
		String num = br.readLine();
		String pre [] = ex.split(" ");
		String Number [] = num.split(" ");
		int N = Integer.parseInt(pre[0]);
		int max = Integer.parseInt(pre[1]);
		int chaNum [] = new int[N];
		for(int i = 0; i<Number.length; i++) {
			chaNum[i] = Integer.parseInt(Number[i]);
		}
		
		int X = 0;
		for(int i=0; i<Number.length; i++){
			for(int j = 1; j<Number.length; j++) {
				for(int z = 2; z<Number.length; z++) {
					int sum = chaNum[i] + chaNum[j] + chaNum[z];
					if(sum>max) {
						break;
					}
					if(sum >=X && sum<max) {
						X = sum;
					}
				}
			}
		}
		System.out.println(X);
	}

}

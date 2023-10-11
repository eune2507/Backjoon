package B9000.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
// 스택으로 풀어보기 '(' 를 스택에 push ')'를 만나면 pop 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String X [] = new String[T];
		
		for(int i = 0; i<X.length; i++) {
			X[i] = br.readLine();
		}	
		
	}

}

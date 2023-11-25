package B1000.q1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str [] = new String[T];
		
		for(int i = 0; i<T; i++) {
			str[i] = br.readLine();
		}
		for(int i = 0; i<T; i++) {
			String [] num = str[i].split(" ");
			int Jx = Integer.parseInt(num[0]);
			int Jy = Integer.parseInt(num[1]);
			int JtoR = Integer.parseInt(num[2]);
			int Bx = Integer.parseInt(num[3]);
			int By = Integer.parseInt(num[4]);
			int BtoR = Integer.parseInt(num[5]);
			
			int JBX = (int)(Math.pow((Bx-Jx), 2)+Math.pow((By-Jy), 2));
			
			
			if(Jx==Bx && Jy == By && JtoR==BtoR) {
				System.out.println("-1");
			} else if (JBX > Math.pow((JtoR+BtoR), 2)) {
				System.out.println("0");
			} else if (JBX < Math.pow((JtoR-BtoR), 2)) {
				System.out.println("0");
			} else if (JBX == Math.pow((JtoR+BtoR), 2)) {
				System.out.println("1");
			} else if (JBX == Math.pow((JtoR-BtoR), 2)) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}

	}

}

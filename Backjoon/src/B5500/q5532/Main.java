package B5500.q5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());
		int totalkor = Integer.parseInt(br.readLine());
		int totalmath = Integer.parseInt(br.readLine());
		int daykor = Integer.parseInt(br.readLine());
		int daymath = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=day; i++) {
			if(totalkor <= 0 && totalmath <=0) {
				System.out.print(day-i+1);
				break;
			}
			totalkor -= daykor;
			totalmath -= daymath;
		}
	}

}

package B5500.q5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Abur = Integer.parseInt(br.readLine());
		int Bbur = Integer.parseInt(br.readLine());
		int Cbur = Integer.parseInt(br.readLine());
		int cok = Integer.parseInt(br.readLine());
		int sa = Integer.parseInt(br.readLine());
		
		int set [] = new int [6];
		set[0] = Abur + cok;
		set[1] = Abur + sa;
		set[2] = Bbur + cok;
		set[3] = Bbur + sa;
		set[4] = Cbur + cok;
		set[5] = Cbur + sa;
		
		Arrays.sort(set);
		System.out.print(set[0] - 50);
	}

}

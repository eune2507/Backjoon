package B2800.q2845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
//		첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 
//		파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
//		둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 
//		106보다 작은 양의 정수 5개가 주어진다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		String [] num = one.split(" ");
		String [] peo = two.split(" ");
		int sum = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
		System.out.print(Integer.parseInt(peo[0])-sum+" ");
		System.out.print(Integer.parseInt(peo[1])-sum+" ");
		System.out.print(Integer.parseInt(peo[2])-sum+" ");
		System.out.print(Integer.parseInt(peo[3])-sum+" ");
		System.out.print(Integer.parseInt(peo[4])-sum+" ");
	}

}

package B3000.p3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 의자 7개 접시 7개 나이프 7개 일곱난쟁이
		// 일곱난쟁이 모자에 적힌 정수의 합은 100
		// 아홉 난쟁이의 모자에 쓰여있는 수가 주어졌을때 일곱난쟁이 찾기
		// 9개의 수 중 합이 100이 되는 7개의 수
		
		Scanner sc = new Scanner(System.in);
		int [] hat = new int [9];
		int sum = 0;
		for (int i = 0; i<hat.length; i++) {
			hat[i] = sc.nextInt();
			sum += hat[i];
		}
		sc.close();
		
		for(int i = 0; i<hat.length; i++) {
			for(int j =i+1; j<hat.length; j++) {
				if(sum-hat[i]-hat[j]==100 && i!=j) {
					int x = i;
					int y = j;
					for(int z = 0; z<hat.length; z++) {
						if(z!=x && z!=y) {
							System.out.println(hat[z]);
						}
					}
				}
			}
		}
	}
}

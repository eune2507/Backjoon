package B1100.q1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int rgb[][];
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		rgb = new int[N][3];

		for (int i = 0; i < rgb.length; i++) {
			String str = br.readLine();
			String num[] = str.split(" ");
			for (int k = 0; k < rgb[i].length; k++) {
				rgb[i][k] = Integer.parseInt(num[k]);
			}
		}
		int R = 0;
		int G = 1;
		int B = 2;
		
		for(int i =1; i<N; i++) {
			rgb[i][R] += Math.min(rgb[i-1][G], rgb[i-1][B]);
			rgb[i][G] += Math.min(rgb[i-1][R], rgb[i-1][B]);
			rgb[i][B] += Math.min(rgb[i-1][G], rgb[i-1][R]);
		}
		System.out.println(Math.min(Math.min(rgb[N-1][R], rgb[N-1][G]),rgb[N-1][B]));

	}

	public static int paint() {
		// N번줄은 N-1과 같지 않으며 N+1과 다름
		int min = 0;
		int sum = 0;
		int check = 4;
		// 1번줄 색 체크
//		if (check == 4) {
//			if (rgb[0][0] < rgb[0][1] && rgb[0][0] < rgb[0][2]) {
//				min = rgb[0][0];
//				check = 0;
//			} else if (rgb[0][1] < rgb[0][0] && rgb[0][1] < rgb[0][2]) {
//				min = rgb[0][1];
//				check = 1;
//			} else if (rgb[0][2] < rgb[0][1] && rgb[0][2] < rgb[0][0]) {
//				min = rgb[0][2];
//				check = 2;
//			}
//		}
//		System.out.println("(0, " +check+")");
//		System.out.println("min: "+ min);
		sum += min;
//		System.out.println("sum : "+ sum);
		for (int i = 0; i < N - 1; i++) {
			// 1~N까지 색상 체크
			if (check == 4) {
				int A = rgb[i][1] + rgb[i + 1][0];
				int B = rgb[i][1] + rgb[i + 1][2];
				int C = rgb[i][2] + rgb[i + 1][0];
				int D = rgb[i][2] + rgb[i + 1][1];
				int E = rgb[i][0] + rgb[i + 1][1];
				int F = rgb[i][0] + rgb[i + 1][2];

				if ((A < B & A < C & A < D & A < E & A < F) | (B < A & B < C & B < D & B < E & B < F)) {
					min = rgb[i][1];
					check = 1;
				} else if ((C < A & C < B & C < D & C < E & C < F) | (D < A & D < B & D < C & D < E & D < F)) {
					min = rgb[i][2];
					check = 2;
				} else {
					min = rgb[i][0];
					check = 0;
				}
			} else if (check == 0) {
				int A = rgb[i][1] + rgb[i + 1][0];
				int B = rgb[i][1] + rgb[i + 1][2];
				int C = rgb[i][2] + rgb[i + 1][0];
				int D = rgb[i][2] + rgb[i + 1][1];

				if ((A < B & A < C & A < D) | (B < A & B < C & B < D)) {
					min = rgb[i][1];
					check = 1;
					if (i == N - 2) {
						if (A < B) {
							sum += rgb[i + 1][0];
						} else {
							sum += rgb[i + 1][2];
						}
					}
				} else {
					min = rgb[i][2];
					check = 2;
					if (i == N - 2) {
						if (C < D) {
							sum += rgb[i + 1][0];
						} else {
							sum += rgb[i + 1][1];
						}
					}
				}
			} else if (check == 1) {
				int A = rgb[i][0] + rgb[i + 1][1];
				int B = rgb[i][0] + rgb[i + 1][2];
				int C = rgb[i][2] + rgb[i + 1][0];
				int D = rgb[i][2] + rgb[i + 1][1];
				if ((A < B & A < C & A < D) | (B < A & B < C & B < D)) {
					min = rgb[i][0];
					check = 0;
					if (i == N - 2) {
						if (A < B) {
							sum += rgb[i + 1][1];
						} else {
							sum += rgb[i + 1][2];
						}
					}
				} else {
					min = rgb[i][2];
					check = 2;
					if (i == N - 2) {
						if (C < D) {
							sum += rgb[i + 1][0];
						} else {
							sum += rgb[i + 1][1];
						}
					}
				}
			} else if (check == 2) {
				int A = rgb[i][0] + rgb[i + 1][1];
				int B = rgb[i][0] + rgb[i + 1][2];
				int C = rgb[i][1] + rgb[i + 1][0];
				int D = rgb[i][1] + rgb[i + 1][2];

				if ((A < B & A < C & A < D) | (B < A & B < C & B < D)) {
					min = rgb[i][0];
					check = 0;
					if (i == N - 2) {
						if (A < B) {
							sum += rgb[i + 1][1];
						} else {
							sum += rgb[i + 1][2];
						}
					}
				} else {
					min = rgb[i][1];
					check = 1;
					if (i == N - 2) {
						if (C < D) {
							sum += rgb[i + 1][0];
						} else {
							sum += rgb[i + 1][2];
						}
					}
				}
			}

//			System.out.println("("+i+", "+check+")");
//			System.out.println("min : "+ min);
			sum += min;
//			System.out.println("sum : " + sum);

		}
		// 마지막줄 체크
//		if (check == 0) {
//			if (rgb[N - 1][1] < rgb[N - 1][2]) {
//				min = rgb[N - 1][1];
//				check = 1;
//			} else {
//				min = rgb[N - 1][2];
//				check = 2;
//			}
//		} else if (check == 1) {
//			if (rgb[N - 1][0] < rgb[N - 1][2]) {
//				min = rgb[N - 1][0];
//				check = 0;
//			} else {
//				min = rgb[N - 1][2];
//				check = 2;
//			}
//		} else if (check == 2) {
//			if (rgb[N - 1][0] < rgb[N - 1][1]) {
//				min = rgb[N - 1][0];
//				check = 0;
//			} else {
//				min = rgb[N - 1][1];
//				check = 1;
//			}
//		}
//		System.out.println("("+(N-1)+", " +check+")");
//		System.out.println("min : "+ min);
//		sum += min;
//		System.out.println("sum : "+ sum);
		return sum;
	}
}

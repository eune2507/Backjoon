package B2900.q2920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String music = br.readLine();
		if(music.contains("1 2 3 4 5 6 7 8")) {
			bw.write("ascending");
		} else if(music.contains("8 7 6 5 4 3 2 1")) {
			bw.write("descending");
		} else {
			bw.write("mixed");
		}
		bw.flush();
		bw.close();
		br.close();

	}

}

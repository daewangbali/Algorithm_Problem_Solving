package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5597 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = new int[30];
		for(int T = 1;T<=28;T++) {
			int tc = Integer.parseInt(br.readLine());
			array[(tc-1)] = 1;
		}
		for(int i = 0;i<30;i++) {
			if(array[i]==0) {
				System.out.println(i+1);
			}
		}
	}
}

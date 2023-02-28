package baekjoon;

import java.io.*;
import java.util.*;

public class Main8958 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int score = 0;
			int count = 1;
			String S = br.readLine();
			for(int j=0;j<S.length();j++) {				
				if(S.charAt(j)=='O') {
					score += count;
					count++;
				}else if(S.charAt(j)=='X') {
					count = 1;
				}
			}
			System.out.println(score);
		}
	}
}

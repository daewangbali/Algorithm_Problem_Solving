package baekjoon;

import java.io.*;
import java.util.*;

public class Main2562 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int max = 0;
		int maxLine = 0;
		for(int T = 1; T <= 9;T++) {
			int tc = Integer.parseInt(br.readLine());
			if(tc>max) {
				max = tc;
				maxLine = T;
			}
		}
		System.out.println(max);
		System.out.println(maxLine);
	}
}

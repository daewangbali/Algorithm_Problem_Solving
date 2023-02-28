package baekjoon;

import java.io.*;
import java.util.*;

public class Main10818 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int min = 1000000;
		int max = -1000000;
		st = new StringTokenizer(br.readLine());
		for(int tc = 1;tc<=T;tc++) {
			int num = Integer.parseInt(st.nextToken());
			if(min>num) {
				min = num;
			}
			if(max<num) {
				max = num;
			}
		}
		System.out.println(min + " " + max);
		
	}

}

package baekjoon;

import java.io.*;
import java.util.*;

public class Main2566 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		int max = 0;
		int row = 0;
		int column = 0;
		int[][] arr = new int[9][9];
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
		sb.append(max).append("\n").append(row+1).append(" ").append(column+1);
		System.out.println(sb);
	}
}

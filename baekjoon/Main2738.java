package baekjoon;

import java.io.*;
import java.util.*;

public class Main2738 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		int N,M;
		st = new StringTokenizer(br.readLine());//첫째줄 읽어옴
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] array = new int[N][M];
		for(int tc=0;tc<N;tc++) {
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				array[tc][i] = Integer.parseInt(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				int num = array[i][j] + Integer.parseInt(st.nextToken());
				sb.append(num).append(" ");
			}sb.append("\n");
		}
		System.out.println(sb);
	}
}

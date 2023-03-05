package baekjoon;
import java.io.*;
import java.util.*;

public class Main7568 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			p[i][0] = x;
			p[i][1] = y;
		}
		for(int i=0 ; i<N ; i++) {
			int count = 1;
			for(int j=0 ; j<N ; j++) {
				if(i == j)
					continue;
				if(p[i][0] < p[j][0] && p[i][1] < p[j][1]) {
					count++;
				}
			}
			sb.append(count+" ");
		}
		
		System.out.println(sb.toString());
	}
	
}

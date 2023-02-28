package baekjoon;
import java.io.*;
import java.util.*;

public class Main1929 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		boolean[] pnum = new boolean[end+1];
		
		pnum[0] = pnum[1] = true;
		
		for(int i=2;i<=Math.sqrt(end);i++) {
			if(!pnum[i]) {
				for(int j=i*i;j<=end;j+=i) {
					pnum[j] = true;
				}
			}
		}
		for(int i=start;i<=end;i++) {
			if(!pnum[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}

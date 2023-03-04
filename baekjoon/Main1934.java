package baekjoon;
import java.io.*;
import java.util.*;

public class Main1934 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int encd(int bn, int sn) {
		int r = bn % sn;
		
		if(r == 0){
			return sn;
		}else {
			return encd(sn,r);
		}
	}
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int G = 0;
			if(a > b) {
				G = encd(a,b);
			}else {
				G = encd(b,a);
			}
			sb.append((a * b) / G).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}

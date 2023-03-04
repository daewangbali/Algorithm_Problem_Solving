package baekjoon;
import java.io.*;
import java.util.*;

public class Main3036 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int encd(int bn, int sn) {
		int r = bn % sn;
		if(r == 0) {
			return sn;			
		}else {
			return encd(sn, r);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int f = Integer.parseInt(st.nextToken());
		for(int i=1 ; i<N ; i++) {
			int r = Integer.parseInt(st.nextToken());
			int G = 0;
			if(f > r) {
				G = encd(f,r);				
			}else {				
				G = encd(r,f);
			}
			sb.append(f / G).append("/").append(r / G).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

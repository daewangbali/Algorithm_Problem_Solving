package baekjoon;
import java.io.*;
import java.util.*;

public class Main2609 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int encd(int bn, int sn) {
		int r = bn % sn;
		
		if(r == 0) {
			return sn;
		}else {
			return encd(sn,r);
		}
	}
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int G = 0;
		//입력된 두 수 중 큰 수 판단
		if(a > b) {			
			G = encd(a,b);
		}
		else {
			G = encd(b,a);
		}
		System.out.println(G);
		System.out.println((a * b) / G);
		
	}
}

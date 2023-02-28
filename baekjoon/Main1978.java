package baekjoon;
import java.util.*;
import java.io.*;

public class Main1978 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int pnumCount = 0;
		st = new StringTokenizer(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			boolean pnum = true;
			int N = Integer.parseInt(st.nextToken());
			if(N == 1) {	// 1 인경우 다음 반복문으로
				continue;
			}
			for(int i=2;i<N;i++) {
				if(N % i == 0) {
					pnum = false;
					break;
				}
			}
			if(pnum) {
				pnumCount++;
			}
		}
		System.out.println(pnumCount);
	}
}

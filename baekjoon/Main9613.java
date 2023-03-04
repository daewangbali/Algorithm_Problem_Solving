package baekjoon;
import java.io.*;
import java.util.*;

public class Main9613 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st ;
	static StringBuilder sb = new StringBuilder();
	static int encd(int bn, int sn) {
		int r = bn % sn;
		if(r == 0) {
			return sn;
		}else {
			return encd(sn, r);
		}
	}
	public static void main(String[] args) throws IOException{
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			Long G = 0L;
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] narray = new int[n];
			//gcd를 구해야 하는 잆력값을 뽑기 위해 먼저 배열에 담기
			for(int i=0 ; i<n ; i++) {
				narray[i] = Integer.parseInt(st.nextToken());
			}
			//배열에 담은 입력값을 2개씩 뽑아 각각의 GDC를 구해 더해준다.
			for(int i=0 ; i<n-1 ; i++) {
				for(int j=i+1 ; j<n ; j++) {
					if(narray[i] > narray[j]) {
						G += encd(narray[i], narray[j]);
					}else {
						G += encd(narray[j], narray[i]);
					}
				}
			}
			sb.append(G).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

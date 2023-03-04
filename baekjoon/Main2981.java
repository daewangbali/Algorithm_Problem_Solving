package baekjoon;
import java.io.*;
import java.util.*;

public class Main2981 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int eucd(int bn, int sn) {
		int r = bn % sn;
		if(r == 0) {
			return sn;
		}else {
			return eucd(sn,r);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] narr = new int[N];
		for(int i=0 ; i<N ; i++) {
			narr[i] =Integer.parseInt(br.readLine()); 
		}
		Arrays.sort(narr);
		
		int gcdVal = narr[1] - narr[0];
		
		for(int i=2 ; i<N ; i++) {
			gcdVal = eucd(gcdVal, narr[i] - narr[i-1] );
		}
		
		for(int i=2 ; i<=gcdVal/2 ; i++) {
			if(gcdVal % i == 0) {
				sb.append(i + " ");
			}
		}
		sb.append(gcdVal);

		System.out.println(sb.toString());
	}
}

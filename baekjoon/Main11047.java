package baekjoon;
import java.io.*;
import java.util.*;

public class Main11047 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		int result = 0;
		
		for(int i = N-1 ; i >= 0 ; i--) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i <N ; i++) {
			if(coins[i] > K)
				continue;
			result += (K / coins[i]);
			K %= coins[i];
		}
		
		System.out.println(result);
		
	}
}

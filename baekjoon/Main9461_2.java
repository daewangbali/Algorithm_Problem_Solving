package baekjoon;
import java.io.*;

public class Main9461_2 {
	static long padovan(int n) {
		if(dp[n] != 0)
			return dp[n];
		else {			
			return dp[n] = padovan(n-2) + padovan(n-3);
		}
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static long[] dp = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=0 ; i<T ; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(padovan(n)).append("\n");
		}
		System.out.println(sb.toString());
	}
}

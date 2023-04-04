package baekjoon;
import java.io.*;

public class Main9461 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static long[] dp = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		dp[1] = dp[2] = 1;
		for(int i=3 ; i<=100 ; i++) {
			dp[i] = dp[i-2] + dp[i-3];
		}
		for(int i=0 ; i<T ; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append("\n");
		}
		System.out.println(sb.toString());
	}
}

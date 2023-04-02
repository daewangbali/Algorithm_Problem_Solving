package baekjoon;
import java.io.*;

public class Main1904_2 {
	
	static int d(int n) {
		if(dp[n] == -1)
			dp[n] = (d(n-1) + d(n-2)) % 15746;
		return dp[n];
	}
	
	static int[] dp = new int[1000001];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		//배열값 -1로 초기화
		for(int i=3 ; i<dp.length ; i++) {
			dp[i] = -1;
		}
		
		System.out.println(d(n));
		
	}
}

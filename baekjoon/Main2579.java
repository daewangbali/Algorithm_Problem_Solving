package baekjoon;
import java.io.*;

public class Main2579 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		
		//n이 1이 입력될 경우 예외처리
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i=3 ; i<=n ; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
		}
		
		System.out.println(dp[n]);
		
	}
}

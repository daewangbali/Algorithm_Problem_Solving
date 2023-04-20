package baekjoon;
import java.io.*;
import java.util.Arrays;

public class Main2579_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr;
	static int[] dp;
	
	static int find(int n) {
		//아직 탐색하지 않는 n번째 계단일 경우
		if(dp[n] == -1) {
			dp[n] = Math.max(find(n-2), find(n-3) + arr[n-1]) + arr[n];
		}
		return dp[n];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new int[n+1];
		
		//dp배열 -1값으로 초기화
		Arrays.fill(dp, -1);
		
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;	// 디폴트값이 null이므로 0으로 초기화 해주어야한다.
		dp[1] = arr[1];
		
		//n이 1이 입력될 경우 예외처리
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
		
	}
}

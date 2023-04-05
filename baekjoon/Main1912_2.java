package baekjoon;
import java.io.*;
import java.util.*;

public class Main1912_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = dp[0] = arr[0];
		for(int i=1; i<n ; i++) {
			//(���� dp + ���� arr��) �� ���� arr�� �� ū ���� dp�� ����
			dp[i] = Math.max((dp[i-1] + arr[i]), arr[i]);
			
			//�ִ� ����
			max = Math.max(dp[i], max);
			
		}
		
		System.out.println(max);
	}
}

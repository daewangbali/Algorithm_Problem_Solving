package baekjoon;
import java.io.*;
import java.util.Arrays;

public class Main2579_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr;
	static int[] dp;
	
	static int find(int n) {
		//���� Ž������ �ʴ� n��° ����� ���
		if(dp[n] == -1) {
			dp[n] = Math.max(find(n-2), find(n-3) + arr[n-1]) + arr[n];
		}
		return dp[n];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new int[n+1];
		
		//dp�迭 -1������ �ʱ�ȭ
		Arrays.fill(dp, -1);
		
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;	// ����Ʈ���� null�̹Ƿ� 0���� �ʱ�ȭ ���־���Ѵ�.
		dp[1] = arr[1];
		
		//n�� 1�� �Էµ� ��� ����ó��
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
		
	}
}

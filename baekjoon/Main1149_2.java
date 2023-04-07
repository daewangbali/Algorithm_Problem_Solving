package baekjoon;
import java.io.*;
import java.util.*;

public class Main1149_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][] dp;
	static int[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		
		System.out.println(Math.min(paint(N-1,0),Math.min(paint(N-1, 1),paint(N-1, 2))));
	}
	
	static int paint(int N, int color) {
		if(dp[N][color] == 0) {
			// color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장
			if(color == 0) {
				dp[N][0] = Math.min(paint(N-1, 1) , paint(N-1, 2)) + arr[N][0];
			}else if(color == 1) {
				dp[N][1]= Math.min(paint(N-1, 0) , paint(N-1, 2)) + arr[N][1];
			}else {
				dp[N][2] = Math.min(paint(N-1, 0) , paint(N-1, 1)) + arr[N][2];
			}
		}
		return dp[N][color];
	}
}

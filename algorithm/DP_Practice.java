package algorithm;
import java.io.*;
import java.util.*;

public class DP_Practice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	// 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[100];
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());;
		}
		
		int[][] sarr = new int[N][N];
		for(int i=0 ; i<N ; i++) {
			
		}
		// 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < N; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        // 계산된 결과 출력
        System.out.println(d[N - 1]);
		
	}
}

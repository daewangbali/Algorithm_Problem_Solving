package baekjoon;
import java.io.*;
import java.util.*;

public class Main1149 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		//1���� N-1���� �� i�� i-1�� ���� �ٸ� ���� �� �ּڰ��� �����Ͽ� ���Ѵ�.
		for(int i=1 ; i<N ; i++) {
			arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
		}
		
		System.out.println(Math.min(Math.min(arr[N - 1][0], arr[N - 1][1]), arr[N - 1][2]));
	}
}

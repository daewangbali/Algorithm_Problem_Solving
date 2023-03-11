package baekjoon;
import java.io.*;
import java.util.*;

public class Main1931 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//종료시간이 같을 경우 시작시간이 빠른순으로 정렬
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		int count = 0;
		int min = 0;
		for(int i=0 ; i<N ; i++) {
			// 직전 종료시간이 다음 회의 시작시간보다 작거나 같다면 갱신
			if(min <= arr[i][0]) {
				min = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}

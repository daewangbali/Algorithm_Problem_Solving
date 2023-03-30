package algorithm;
import java.io.*;
import java.util.*;

public class Binary_Search_Practice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int start = 0;
		int end = arr[N-1];
		int result = 0;
		while(start <= end) {
			int mid = (start + end) / 2;
			long leng = 0;
			for(int i=0 ; i<arr.length ; i++) {
				//잘랐을 때의 떡의 양 계산
				if(arr[i] > mid) {
					leng += (arr[i] - mid);
				}
			}
			//떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
			if(M > leng) {
				end = mid -1;
			}
			//떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
			else {
				result = mid;//최대한 덜 잘랐을 때가 정답이므로, 여기에서 result 기록
				start = mid + 1;
			}
			
		}
		
		System.out.println(result);
 		
	}
}

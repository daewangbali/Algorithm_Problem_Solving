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
				//�߶��� ���� ���� �� ���
				if(arr[i] > mid) {
					leng += (arr[i] - mid);
				}
			}
			//���� ���� ������ ��� �� ���� �ڸ���(���� �κ� Ž��)
			if(M > leng) {
				end = mid -1;
			}
			//���� ���� ����� ��� �� �ڸ���(������ �κ� Ž��)
			else {
				result = mid;//�ִ��� �� �߶��� ���� �����̹Ƿ�, ���⿡�� result ���
				start = mid + 1;
			}
			
		}
		
		System.out.println(result);
 		
	}
}

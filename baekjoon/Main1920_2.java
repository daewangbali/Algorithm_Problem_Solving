package baekjoon;
import java.io.*;
import java.util.*;

public class Main1920_2 {
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		if(start > end)
			return 0;
		int mid = (start + end) / 2;
		if(arr[mid] == target) {
			return 1;
		}else if(arr[mid] > target) {
			return binarySearch(arr, target, start, mid - 1);
		}else {
			return binarySearch(arr, target, mid + 1, end);
		}
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<M ; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, target, 0, N-1)).append("\n");
		}
		System.out.println(sb.toString());
		
	}
}

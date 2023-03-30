package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binary_Search2 {
	//이진 탐색 소스코드 구현(반복문)
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end) / 2;
			//찾은 경우 중간점 인덱스 반환
			if(arr[mid] == target) {
				return mid;			
			}
			//중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			//중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
			else if(arr[mid] > target) {
				end = mid -1;
			}
		}
		return -1;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		//원소 개수(N)과 찾고자 하는 데이터(target) 입력받기
		int N = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		//전체 원소 받기
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = binarySearch(arr, target, 0, N-1);
		if(result == -1) {
			System.out.println("원소가 존재하지 않습니다.");
		}else {
			System.out.println(result + 1);
		}
	}
}

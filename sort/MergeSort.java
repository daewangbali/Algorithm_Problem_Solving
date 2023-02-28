package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {
	static void mergeSort(int[] arr, int left, int right) {
		//이외의 경우는 크기가 1개인 경우
		if(left < right) {
			int mid = (left+right) / 2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void merge(int[] arr, int left, int mid, int right) {
		int leftIndex = left;
		int rightIndex = mid + 1;
		int sorteIndex = left;
		//정렬하면서 값 담을 임시 배열
		int[] tmpSortedArray = new int[right + 1];
		
		//작은 순서대로 배열에 삽입
		while(leftIndex <= mid && rightIndex <= right) {
			if(arr[leftIndex] <= arr[rightIndex]) {
				tmpSortedArray[sorteIndex] = arr[leftIndex];
				leftIndex++;
			}else {
				tmpSortedArray[sorteIndex] = arr[rightIndex];
				rightIndex++;
			}
			sorteIndex++;
		}
		//남은 데이터도 삽입
		if(leftIndex > mid) {
			for(int i=rightIndex; i<=right;i++) {
				tmpSortedArray[sorteIndex] = arr[i];
				sorteIndex++;
			}
		}else {
			for(int i=leftIndex; i<=mid;i++) {
				tmpSortedArray[sorteIndex] = arr[i];
				sorteIndex++;
			}
		}
		//정렬된 배열을 원래 배열에 삽입
		for(int i=left; i<=right; i++) {
			arr[i] = tmpSortedArray[i];
		}
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for(int i=0;i<T;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb.toString());
		
	}

}

package baekjoon;
import java.io.*;
import java.util.*;

public class Main24060 {
	static int num = 0;
	static int count = 1;
	static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int q = (left + right) / 2;
			mergeSort(arr, left, q);
			mergeSort(arr, q+1, right);
			merge(arr, left, q, right); // º´ÇÕ
		}
	}
	static void merge(int[] arr, int left, int q, int right) {
		int leftIndex = left;
		int rightIndex = q + 1;
		int sortedIndex = left;
		int[] tmpArr = new int[right + 1];
		while(leftIndex <= q && rightIndex <= right) {
			if(arr[leftIndex] <= arr[rightIndex]) {
				tmpArr[sortedIndex] = arr[leftIndex];
				leftIndex++;
			}else {
				tmpArr[sortedIndex] = arr[rightIndex];
				rightIndex++;
			}
			sortedIndex++;
		}
		if(leftIndex <= q) {
			for(int i = leftIndex; i <= q;i++) {
				tmpArr[sortedIndex] = arr[i];
				sortedIndex++;
			}
		}else {
			for(int i = rightIndex ; i <= right;i++) {
				tmpArr[sortedIndex] = arr[i];
				sortedIndex++;
			}
		}
		for(int i = left; i <= right; i++) {
			if(count == num) {
				num = tmpArr[i];
				break;
			}
			arr[i] = tmpArr[i];
			count++;
		}
		if(num > count) {
			num = -1;
		}
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		num = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[T];
		for(int i=0;i<T;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		mergeSort(arr, 0, arr.length-1);
		System.out.println(num);
	}
}

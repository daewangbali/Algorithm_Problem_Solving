package sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] data = {1,10,5,8,7,6,4,3,2,9};
		quickSort(data, 0, 9);
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
	}
	static void quickSort(int data[],int start, int end) {
		if(start >= end) {
			return;
		}
		int key = start;
		int i = start+1;
		int j = end;
		int temp = 0;
		
		while(i <= j) {
			while(i <= end && data[i] <= data[key]) { // key 보다 작으면 반복 그 말은 key 보다 큰 값을 찾는다.
				i++;
			}while(j > start && data[j] >= data[key]) { // key 보다 크면 반복 그 말은 key 보다 작은 값을 찾는다.
				j--;
			}
			if(i > j) { // 현재 엇갈린 상태면 키값과 작은 값 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}else { //엇갈린 상태가 아니면 큰 값과 작은 값 교체
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
	
	 
}


package sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int min = 0;
		int index = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			min = 10000;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

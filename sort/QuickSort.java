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
			while(i <= end && data[i] <= data[key]) { // key ���� ������ �ݺ� �� ���� key ���� ū ���� ã�´�.
				i++;
			}while(j > start && data[j] >= data[key]) { // key ���� ũ�� �ݺ� �� ���� key ���� ���� ���� ã�´�.
				j--;
			}
			if(i > j) { // ���� ������ ���¸� Ű���� ���� �� ��ü
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}else { //������ ���°� �ƴϸ� ū ���� ���� �� ��ü
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
	
	 
}


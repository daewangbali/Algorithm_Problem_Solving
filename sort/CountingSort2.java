package sort;

public class CountingSort2 {
	public static void main(String[] args) {
		
		int[] arr = new int[50];
		
		for(int i=0;i<50;i++){
			arr[(int)(Math.random()*101)]++; // 0 ~ 100
		}
		
		for(int i=0; i<arr.length ;i++) { 
			while(arr[i]-->0) { // arr ���� 0���� Ŭ ���
				System.out.println(i + " "); // 0�� �ƴϸ� ���� �ִ� ���̴� 0�� �ƴ� ��� 0 ���� ���
			}
		}
		
	}
}

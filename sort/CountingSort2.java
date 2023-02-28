package sort;

public class CountingSort2 {
	public static void main(String[] args) {
		
		int[] arr = new int[50];
		
		for(int i=0;i<50;i++){
			arr[(int)(Math.random()*101)]++; // 0 ~ 100
		}
		
		for(int i=0; i<arr.length ;i++) { 
			while(arr[i]-->0) { // arr 값이 0보다 클 경우
				System.out.println(i + " "); // 0이 아니면 값이 있는 것이니 0이 아닌 경우 0 부터 출력
			}
		}
		
	}
}

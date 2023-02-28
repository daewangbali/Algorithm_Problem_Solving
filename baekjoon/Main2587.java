package baekjoon;
import java.io.*;

public class Main2587 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			int tc = Integer.parseInt(br.readLine());
			arr[i] = tc;
			sum += tc;
		}
		for(int i=0;i<5;i++) {
			int temp = 0;
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}
}

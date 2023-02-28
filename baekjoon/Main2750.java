package baekjoon;
import java.io.*;

public class Main2750 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for(int tc=0;tc<T;tc++) {
			arr[tc] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++) {
			int temp = 0;
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

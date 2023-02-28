package baekjoon;
import java.io.*;

public class Main10989 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for(int i=0;i<T;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>0) {
				while(arr[i] != 0) {
					sb.append(i).append("\n");
					arr[i]--;
				}
			}
		}
		System.out.println(sb.toString());
	}
}

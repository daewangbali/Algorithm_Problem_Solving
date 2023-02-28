package baekjoon;
import java.io.*;
import java.util.*;

public class Main1181 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		for(int i=0;i<T;i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, (e1,e2) ->{
			if(e1.length() == e2.length()) {
				return e1.compareTo(e2);
			}else {
				return e1.length() - e2.length();				
			}
		});
		
		sb.append(arr[0]).append("\n");
		
		for(int i=1;i<T;i++) {
			if(!arr[i].equals(arr[i-1])) {				
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}

package baekjoon;
import java.io.*;

public class Main10809 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String S = br.readLine();
		/*
		 for(char c = 'a'; c <= 'z'; c++) {
	            System.out.print(S.indexOf(c) + " ");
	      }
		*/
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		for(int i=0;i<S.length();i++) {
			char index = S.charAt(i);
			if(arr[index-'a'] == -1)
				arr[index-'a'] = i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}

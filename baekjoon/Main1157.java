package baekjoon;
import java.io.*;

public class Main1157 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int[] arr = new int[26];
		
 		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A' &&c<='Z') {
				arr[c-'A']++;
			}else {
				arr[c-'a']++;
			}
			
		}
 		int max = -1;
 		char maxC = '?';
 		for(int i=0;i<arr.length;i++) {
 		
 			if(max<arr[i]) {
 				max = arr[i];
 				maxC = (char) (i+'A');
 			}
 			else if(max==arr[i]) {
				 maxC = '?';	 
			}
 		}
 		System.out.println(maxC);
	}
	
}

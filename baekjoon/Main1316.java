package baekjoon;
import java.io.*;

public class Main1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		int count = 0;
		for(int tc=1;tc<=T;tc++) {
			String str = br.readLine();
			for(int i=0;i<str.length();i++) {
				
				if(i==str.length()-1) {
					if(arr[str.charAt(i)-97]==1) {
						break;
					}else {
						count++;
					}
				}
				
				else if(str.charAt(i)!=str.charAt(i+1)) {
					if(arr[str.charAt(i)-97]==1) {
						break;
					}else {
						arr[str.charAt(i)-97] = 1;
						
					}
					
				}
				
			}
			
			arr = new int[26];
			
			
		}
		System.out.println(count);
	}
}

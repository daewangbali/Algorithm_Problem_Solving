package baekjoon;
import java.io.*;

public class Main2941 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int count = 0;
		String[] arr = {"c=", "c-", "dz=" ,"d-", "lj", "nj", "s=", "z="};
		for(int i=0;i<s.length();i++) {
			StringBuilder sb = new StringBuilder();
			count++;
			if(i==s.length()-1) {
				break;
			}
			sb.append(s.charAt(i));
			sb.append(s.charAt(i+1));
			for(int j=0;j<arr.length;j++) {
				if(sb.toString().equals("dz") && i+2<+s.length() && s.charAt(i+2)=='=') {
					i= i+2;
					break;
				}
				if(sb.toString().equals(arr[j])) {
					i++;
				}
			}
		}
		System.out.println(count);
	}
}

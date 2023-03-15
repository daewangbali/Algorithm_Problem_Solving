package algorithm;
import java.io.*;
import java.util.*;

public class Implementation4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		List<Character> list = new ArrayList<>();
		int num = 0;
		
		for(int i=0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 65) {
				list.add(c);
			}else {
				num += c - '0';
			}
		}
		Collections.sort(list);
		
		for(char c : list) {
			sb.append(c);
		}
		if(num != 0) {			
			sb.append(num);
		}
		
		System.out.println(sb.toString());
		
	}
}

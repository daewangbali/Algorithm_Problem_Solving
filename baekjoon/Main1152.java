package baekjoon;
import java.io.*;
import java.util.*;

public class Main1152 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		String st = br.readLine();
		st = st.trim();
		System.out.println(st.split(" ").length);
	}
}
/* 
	- Ʋ�� �ڵ�
	String s = br.readLine();
	int count = 1;
	for(int i=1;i<s.length()-1;i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);
	
	- ���� �ڵ�
	st = new StringTokenizer(br.readLine());
	System.out.println(st.countTokens());
*/


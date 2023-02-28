package baekjoon;
import java.io.*;
import java.util.*;

public class Main9012 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<T;i++) {
			String s = br.readLine();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j) == ')' && stack.size() == 0) {
					sb.append("NO").append("\n");
					break;
				}
				if(s.charAt(j) == '(') {
					stack.push('(');
				}else {
					stack.pop();
				}
			}
			if(stack.size() == 0) {
				sb.append("YES").append("\n");
			}else{
				
			}
			stack.clear();
		}
		System.out.println(sb.toString());
	}
}

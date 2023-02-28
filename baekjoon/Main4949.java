package baekjoon;
import java.io.*;
import java.util.*;

public class Main4949 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		String s = "";
		while(true) {
			s = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			if(s.equals(".")) break;
			else {
				for(int i=0;i<s.length();i++) {
						char c = s.charAt(i);
						if(c == '(' || c == '[') {
							stack.push(c);
						}else if(c == ']') {
							if(stack.size() == 0 || stack.peek() != '[') {
								stack.push(c);
								break;
							}else {
								stack.pop();
							}
						}else if(c == ')'){
							if(stack.size() == 0 || stack.peek() != '(') {
								stack.push(c);
								break;
							}else {
								stack.pop();
							}
						}
					}
				
				if(stack.size() == 0 ) {
					sb.append("yes").append("\n");
				}else {
					sb.append("no").append("\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}

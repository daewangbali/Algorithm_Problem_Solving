package baekjoon;
import java.io.*;
import java.util.*;

public class Main10773 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > 0) {
				stack.push(num);
			}else {
				stack.pop();
			}
		}
		for(int i : stack) {
			sum += i;
		}
		System.out.println(sum);	
	}
}

package baekjoon;
import java.io.*;
import java.util.*;

public class Main10828 {
	public static int[] stack;
	public static int size = 0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		stack = new int[T];
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			
			case "pop":
				sb.append(pop()).append("\n");
				break;
			
			case "size":
				sb.append(size()).append("\n");
				break;
				
			case "empty":
				sb.append(empty()).append("\n");
				break;
			
			case "top":
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
static void push(int X) {
		stack[size] = X;
		size++;
	}
	static int pop() {
		if(size == 0) {
			return -1;
		}else {
			int num = stack[size-1];
			stack[size-1] = 0;
			size--;
			return num;
		}
	}
	static int size() {
		return size;
	}
	static int empty() {
		if(size == 0) {
			return 1;
		}else {			
			return 0;
		}
	}
	static int top() {
		if(size == 0) {
			return -1;
		}else {			
			return stack[size-1];
		}
	}
}

package baekjoon;
import java.io.*;
import java.util.*;

public class Main1874 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] inputArr = new int[N];
		int arrIdx = 0;
		Stack<Integer> s = new Stack<Integer>();
		// 입력받은 수열 배열에 입력
		for(int i=0;i<N;i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1;i<=N;i++) {
			s.push(i);
			sb.append("+").append("\n");
			while(true) {
				if(s.size()>0 && s.peek() == inputArr[arrIdx]) {
					s.pop();
					arrIdx++;
					sb.append("-").append("\n");
				}else {
					break;
				}	
			}
		}
		if(s.size() == 0) {
			System.out.println(sb.toString());
		}else {
			System.out.println("NO");
		}
	}
}

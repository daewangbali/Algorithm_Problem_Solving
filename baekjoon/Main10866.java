package baekjoon;
import java.io.*;
import java.util.*;

public class Main10866 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		//ArrayDeque 대신 아래의 LinkedList 사용 가능
		//LinkedList<Integer> dq = new LinkedList<Integer>();
		
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push_front":
				int x = Integer.parseInt(st.nextToken());
				dq.addFirst(x);
				break;
			case "push_back":
				int x2 = Integer.parseInt(st.nextToken());
				dq.addLast(x2);
				break;
				
			case "pop_front":
				if(dq.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(dq.pollFirst()).append("\n");
				}
				break;
				
			case "pop_back":
				if(dq.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(dq.pollLast()).append("\n");
					if(dq.size() != 0) {
					}
				}
				break;
				
			case "size":
				sb.append(dq.size()).append("\n");
				break;
				
			case "empty":
				if(dq.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
				
			case "front":
				if(dq.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(dq.peekFirst()).append("\n");
				}
				break;
				
			case "back":
				if(dq.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(dq.peekLast()).append("\n");
				}
				break;
			}
		}
		System.out.println(sb.toString());
	}
}

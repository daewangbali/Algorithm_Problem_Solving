package baekjoon;
import java.io.*;
import java.util.*;

public class Main18258 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		int last = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				last = x;
				queue.offer(x);
				break;
				
			case "pop":
				Integer item = queue.poll();
				if(item == null) {
					sb.append(-1).append("\n");
				}else {					
					sb.append(item).append("\n");
				}
				break;
				
			case "front":
				Integer item2 = queue.peek();
				if(item2 == null) {
					sb.append(-1).append("\n");
				}else {					
					sb.append(item2).append("\n");
				}
				break;
				
			case "back":
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(last).append("\n");
				}
				break;
				
			case "size":
				sb.append(queue.size()).append("\n");
				break;
				
			case "empty":
				int result = 0;
				if(queue.isEmpty()) {
					result = 1;
				}else {
					result = 0;
				}
				sb.append(result).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}

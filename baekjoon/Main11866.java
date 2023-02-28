package baekjoon;
import java.io.*;
import java.util.*;

public class Main11866 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		LinkedList<Integer> q = new LinkedList<Integer>();
		int[] result = new int[N];
		for(int i=1; i<=N ;i++) {
			q.offer(i);
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0; j<k-1 ;j++) {
				int x = q.peek();
				q.poll();
				q.offer(x);
			}
			result[i] = q.poll();
		}
		sb.append("<");
		for(int i=0;i<result.length;i++) {
			if(i == result.length-1) {
				sb.append(result[i]);
			}else {
				sb.append(result[i]).append(",").append(" ");
			}
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
}

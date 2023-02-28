package baekjoon;
import java.io.*;
import java.util.*;

public class Main2164 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		//enqueue
		for(int i=1; i<=N ;i++) {
			q.offer(i);
		}
		while(q.size() != 1) {
			q.poll();
			int x = q.peek();
			q.offer(x);
			q.poll();
		}
		System.out.println(q.peek());
	}
}

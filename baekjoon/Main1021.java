package baekjoon;
import java.io.*;
import java.util.*;

public class Main1021 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> dq = new LinkedList<Integer>();
		int halfIdx = 0;
		int targerIdx = 0;
		int count = 0;
		
		//deque에 값 넣기
		for(int i=1;i<=N;i++) {
			dq.offer(i);
		}
		//숫자 뽑기 위한 반복문
		st = new StringTokenizer(br.readLine());
		while(M --> 0) {
			if(dq.size() / 2 == 0) {				
				halfIdx = dq.size() / 2 - 1;
			}else {
				halfIdx = dq.size() / 2;
			}
			int target = Integer.parseInt(st.nextToken());
			int num = dq.peekFirst();
			while(target != num){
				count++;
				targerIdx = dq.indexOf(target);
				if(halfIdx < targerIdx) {
					int x = dq.pollLast();
					dq.offerFirst(x);
				}else {
					int x = dq.pollFirst();
					dq.offerLast(x);
				}
				num = dq.peekFirst();
			}
			if(target == num) {
				dq.pollFirst();
			}
		}	
		System.out.println(count);
	}
}

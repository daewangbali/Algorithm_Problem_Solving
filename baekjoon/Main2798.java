package baekjoon;
import java.io.*;
import java.util.*;

public class Main2798 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[] visited;
	static int[] cards;
	static int M;
	static int sum= 0;
	static int max = 0;
	static void combination(int start, int count) {
		if(count == 3) { // 3장의 카드를 골랐을 경우
			if(sum <= M && sum > max) { // 3장의 카드 합이 M보다 작고 max보다 큰 경우
				max = sum;
			}
			return;
		}
		
		for(int i=start ; i<cards.length ; i++) {
			if(!visited[i]) {
				visited[i] = true;
				sum += cards[i];
				combination(i+1, count+1);
				visited[i] = false;
				sum -= cards[i];
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		cards = new int[N];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<cards.length;i++) {
			int cardnum = Integer.parseInt(st.nextToken());
			cards[i] = cardnum;
		}
		
		combination(0, 0);
		System.out.println(max);
	}
}

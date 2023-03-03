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
		if(count == 3) { // 3���� ī�带 ����� ���
			if(sum <= M && sum > max) { // 3���� ī�� ���� M���� �۰� max���� ū ���
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

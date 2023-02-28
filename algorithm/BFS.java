package algorithm;
import java.io.*;
import java.util.*;

public class BFS {
	static void bfs(int node) { //�Ű����� node�� ���� node ��ġ�� �־��ش�
		boolean[] visited = new boolean[N];
		
		Queue<Integer> q = new LinkedList<Integer>();
		visited[node] = true;
		q.offer(node);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			sb.append(curr).append(" ");
			
			for(int next = 0;next < N; ++next) {
				if(!visited[next] && graph[curr][next] != 0) { //�湮���� �ʾҰ� && ���� ���� ������ �����
					visited[next] = true;
					q.offer(next);
				}
			}
			
		}
		
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st = null;
	static int N,E;
	static int[][] graph;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		graph = new int[E][E];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < E ; i++) {
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = 1;
		}
		
		bfs(0); // ���۳����ġ : 0
		System.out.println(sb.toString());
	}
}

package algorithm;
import java.io.*;
import java.util.*;

public class BFS {
	static void bfs(int node) { //매개변수 node는 시작 node 위치를 넣어준다
		boolean[] visited = new boolean[N];
		
		Queue<Integer> q = new LinkedList<Integer>();
		visited[node] = true;
		q.offer(node);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			sb.append(curr).append(" ");
			
			for(int next = 0;next < N; ++next) {
				if(!visited[next] && graph[curr][next] != 0) { //방문하지 않았고 && 현재 노드와 인접한 노드라면
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
		
		bfs(0); // 시작노드위치 : 0
		System.out.println(sb.toString());
	}
}

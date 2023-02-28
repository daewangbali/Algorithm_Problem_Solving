package baekjoon;
import java.io.*;
import java.util.*;

public class Main1260 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N,M;
	static int[][] graph;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		int start = Integer.parseInt(st.nextToken());
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = 1;
		}
		dfs(start);
		sb.append("\n");
		bfs(start);
		System.out.println(sb.toString());
		
	}
	/*
	static void dfs(int start) {
		boolean[] visited = new boolean[N+1];
		Stack<Integer> s = new Stack<Integer>();
		s.push(start);
		
		while(!s.isEmpty()) {
			int curr = s.pop();
			
			if(visited[curr])
				continue;
			
			visited[curr] = true;
			sb.append(curr).append(" ");
			
			for(int i = N ; i >= 1 ; i--) {
				if(graph[curr][i] != 0) {
					s.push(i);
				}
			}
		}
		sb.append("\n");
	}
	*/
	//재귀 호출 방법
	static void dfs(int start) {
		visited[start] = true;
		sb.append(start).append(" ");
		
		for(int next = 1 ; next <= N ; next++) {
			if(!visited[next] && graph[start][next] != 0) {
				dfs(next);
			}
		}
 	}
	
	static void bfs(int start) {
		boolean[] visited = new boolean[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		visited[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			sb.append(curr).append(" ");
			
			for(int i = 1; i <= N; i++) {
				if(!visited[i] && graph[curr][i] != 0) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
}

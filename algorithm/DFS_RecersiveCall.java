package algorithm;
import java.io.*;
import java.util.*;

public class DFS_RecersiveCall {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[][] graph;
	static boolean[] visited;
	static int N,M;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N][N];
		visited = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = 1;
		}
		dfs(0);
		System.out.println(sb.toString());
	}
	
	static void dfs(int node) {
		visited[node] = true;
		sb.append(node).append(" ");
		
		for(int next = 0; next < N ; next++) {
			if(!visited[next] && graph[node][next] != 0)
				dfs(next);
		}
		
	}
}

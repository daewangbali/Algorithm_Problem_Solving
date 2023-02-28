package algorithm;
import java.io.*;
import java.util.*;

public class DFS_Stack {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N,M;
	static int[][] graph;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		
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
		boolean[] visited = new boolean[N];
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(node);
		
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			
			if(visited[curr]) continue;
			
			visited[curr] = true;
			sb.append(curr).append(" ");
			
			for(int next = 0;next<N; next++) {
				if(!visited[next] && graph[curr][next] != 0)
				stack.push(next);
			}
		}
	}
}

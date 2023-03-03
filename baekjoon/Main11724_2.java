package baekjoon;
import java.io.*;
import java.util.*;

public class Main11724_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static boolean[][] graph;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		visited = new boolean[N+1];
		graph = new boolean[N+1][N+1];
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = true;
			graph[y][x] = true;
		}
		
		for(int i=1 ; i<=N ; i++) {	
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void dfs(int start) {
		visited[start] = true;
		
		for(int i=1 ; i<graph.length ; i++) {
			if(graph[start][i] && !visited[i])
				dfs(i);
		}
	}
}

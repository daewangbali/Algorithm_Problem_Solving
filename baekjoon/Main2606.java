package baekjoon;
import java.io.*;
import java.util.*;

public class Main2606 {
	
	static int bfs(int start) {
		int count = 0;
		boolean[] visited = new boolean[T+1];
		Queue<Integer> q = new LinkedList<Integer>();
		visited[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			for(int next = 1 ; next <= T; next++) {
				if(!visited[next] && graph[curr][next] == 1) {
					visited[next] = true;
					q.offer(next);
					count++;
				}
			}
		}
		return count;
	}
	
	static int count = 0;
	static int dfs(int start) {
		
		visited[start] = true;
		
		for(int i=1;i<=T;i++) {
			if(!visited[i] && graph[start][i] != 0) {
				count++;
				dfs(i);
			}
		}
		
		return count;
	}

	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int T, N;
	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		graph = new int[T+1][T+1];
		visited = new boolean[T+1];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = 1;
		}
		
		//System.out.println(bfs(1)); // 시작 node 1번 컴퓨터라고 했기 때문에 1
		System.out.println(dfs(1));
		
	}
}

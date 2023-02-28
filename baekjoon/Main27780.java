package baekjoon;
import java.io.*;
import java.util.*;

public class Main27780 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N,M;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int[] visited;
	static int count;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited = new int[N+1];
		count = 0;
		
		//graph index를 정점의 개수만큼 만들어줌
		for(int i = 0 ; i < N + 1 ; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		for(int i=1;i<graph.size();i++) {
			Collections.sort(graph.get(i), Comparator.reverseOrder());
		}
		
		dfs(start);
		
		for(int i=1;i<visited.length;i++) {
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void dfs(int start) {
		count++;
		visited[start] = count;
		
		for(int i = 0; i < graph.get(start).size();i++) {
			if(visited[graph.get(start).get(i)] == 0)
				dfs(graph.get(start).get(i));
		}
	}
}

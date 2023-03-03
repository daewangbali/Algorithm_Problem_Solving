package baekjoon;
import java.io.*;
import java.util.*;

public class Main11724 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		visited = new boolean[N+1];
		
		for(int i=0 ; i<=N ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph.get(x).add(y);
			graph.get(y).add(x);
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
		
		for(int i=0 ; i<graph.get(start).size() ; i++) {
			int n = graph.get(start).get(i);
			if(!visited[n])
				dfs(n);
		}
	}
}

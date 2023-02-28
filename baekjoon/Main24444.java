package baekjoon;
import java.io.*;
import java.util.*;

public class Main24444 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	
	static int[] visited;
	static int N,M;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited = new int[N+1];
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); 
			int y = Integer.parseInt(st.nextToken());
			graph.get(x).add(y);
			graph.get(y).add(x);	
		}
		
		for(int i=1 ; i<=N ; i++) {
			Collections.sort(graph.get(i));
		}
		
		bfs(start);
		
		for(int i=1 ; i<=N ; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		int count = 1;
		visited[start] = count;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			for(int i=0 ; i<graph.get(curr).size() ; i++) {
				int next = graph.get(curr).get(i);
				if(visited[next] != 0) 
					continue;
				count++;
				visited[next] = count;
				q.offer(next);
			}
			
		}
	}
}

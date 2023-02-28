package baekjoon;
import java.io.*;
import java.util.*;

public class Main24445 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited = new int[N+1];
		
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
		
		for(int i=0 ; i<=N ; i++) {
			Collections.sort(graph.get(i),Comparator.reverseOrder());
		}
		
		bfs(start);
		
		for(int i=1 ; i<=N ; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
	static void bfs(int start) {
		int count = 1;
		visited[start] = count;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			for(int i=0;i<graph.get(curr).size();i++) {
				int ad = graph.get(curr).get(i);
				if(visited[ad] != 0)
					continue;
				q.offer(ad);
				count++;
				visited[ad] = count;
			}
			
		}
	}
	
}

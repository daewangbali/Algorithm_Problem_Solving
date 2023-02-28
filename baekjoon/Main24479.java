package baekjoon;
import java.io.*;
import java.util.*;

public class Main24479 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int N,M;
	static int count;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited = new int[N+1];
		
		//graph index를 정점의 개수만큼 만들어줌
		for(int i = 0 ; i < N + 1 ; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			//무방향이기 때문에 양쪽으로 정보를 추가
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		//오름차순을 위해 정렬
		for(int i = 0 ; i < graph.size() ; i++) {
			Collections.sort(graph.get(i));
		}
		
		//시작 정점도 순서에 포함이므로 count 초기값 1 할당
		count = 1;
		
		//깊이 우선 탐색 재귀
		dfs(start);

		for(int i = 1 ; i < visited.length ; i++){
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	
	static void dfs(int start) {
		visited[start] = count;
		
		for(int i = 0 ; i < graph.get(start).size() ; i++) {
			int next = graph.get(start).get(i);
			if(visited[next]==0) {
				count++;
				dfs(next);
			}
		}
	}
}

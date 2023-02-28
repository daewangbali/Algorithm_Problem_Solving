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
		
		//graph index�� ������ ������ŭ �������
		for(int i = 0 ; i < N + 1 ; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			//�������̱� ������ �������� ������ �߰�
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		//���������� ���� ����
		for(int i = 0 ; i < graph.size() ; i++) {
			Collections.sort(graph.get(i));
		}
		
		//���� ������ ������ �����̹Ƿ� count �ʱⰪ 1 �Ҵ�
		count = 1;
		
		//���� �켱 Ž�� ���
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

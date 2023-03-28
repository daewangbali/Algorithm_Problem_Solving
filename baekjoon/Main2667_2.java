package baekjoon;
import java.io.*;
import java.util.*;

public class Main2667_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static boolean[][] visited;
	static int[][] graph;
	static int countDanji;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	
	static void dfs(int row, int col) {
		visited[row][col] = true;
		countDanji++;
		
		for(int i = 0 ; i < 4 ; i++) {
			int nr = row + D[i][0];
			int nc = col + D[i][1];
			
			if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1)
				continue;
			if(!visited[nr][nc] && graph[nr][nc] == 1)
				dfs(nr,nc);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		visited = new boolean[N][N];
		graph = new int[N][N];
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<N;j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(!visited[i][j] && graph[i][j] == 1) {
					countDanji = 0;
					dfs(i,j);
					list.add(countDanji);
				}
				
			}
		}
		
		sb.append(list.size()).append("\n");
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
}

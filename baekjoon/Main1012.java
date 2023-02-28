package baekjoon;
import java.io.*;
import java.util.*;

public class Main1012 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	
	static int[][] graph;
	static int M,N;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int countBechu;
	static boolean[][] visited;
	
	static void dfs(int row, int col) {
		visited[row][col] = true;
		//graph[row][col] = 0;
			
		for(int i=0;i<4;i++) {
			int nr = row + D[i][0];
			int nc = col + D[i][1];
			
			if(nr < 0 || nr > M-1 || nc < 0 || nc > N-1)
				continue;
			if(graph[nr][nc] == 1 && !visited[nr][nc]) 
				dfs(nr,nc);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			graph = new int[M][N];
			visited = new boolean[M][N];
		
			countBechu = 0;
			for(int i=0;i<k;i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x][y] = 1;
			}
			
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(graph[i][j] == 1 && !visited[i][j] ) {
						dfs(i,j);
						countBechu++;
					}
				}
			}
			sb.append(countBechu).append("\n");
		}
		System.out.println(sb.toString());
	}
}
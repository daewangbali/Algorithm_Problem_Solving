package baekjoon;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N , M;
	static class Point{
		Point(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
		int row,col,dist;
	}
	
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int[][] board;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<M;j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs(0,0,N-1,M-1));
		
		
	}
	
	static int bfs(int sRow, int sCol, int eRow, int eCol) {
		boolean[][] visited = new boolean[N][M];
		Queue<Point> q = new LinkedList<Point>();
		visited[sCol][sRow] = true;
		q.offer(new Point(sRow,sCol,1));
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			if(curr.row == eRow && curr.col == eCol)
				return curr.dist;
			
			for(int i=0;i<4;i++) {
				int nr = curr.row + D[i][0];
				int nc = curr.col + D[i][1];
				
				if(nr < 0 || nr > N-1 || nc < 0 || nc > M-1) 
					continue;
				if(visited[nr][nc])
					continue;
				if(board[nr][nc] == 0)
					continue;
				
				visited[nr][nc] = true;
				q.offer(new Point(nr,nc,curr.dist + 1));
			}
		}
		
		return 0;
		
	}
	
	
}

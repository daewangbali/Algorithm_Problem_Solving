package algorithm;
import java.io.*;
import java.util.*;

public class FloodFill_Stack {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int N;
	static int[][] board;
	static class Point{
		int row, col;
		Point(int r, int c){
			row = r;
			col = c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int color = Integer.parseInt(st.nextToken());
		dfs(r, c, color);
		
		for(int i=0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				System.out.print(board[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void dfs(int r, int c, int color) {
		boolean[][] visited = new boolean[N][N];
		Stack<Point> s = new Stack<Point>();
		s.push(new Point(r,c));
		
		while(!s.isEmpty()) {
			Point curr = s.pop();
			if(visited[curr.row][curr.col])
				continue;
			
			visited[curr.row][curr.col] = true;
			board[curr.row][curr.col] = color;
			
			for(int i=0;i<4;i++) {
				int nr = curr.row + D[i][0];
				int nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1 )
					continue;
				if(visited[nr][nc])
					continue;
				if(board[nr][nc] ==1)
					continue;
				
				s.push(new Point(nr,nc));
			}
		}
	}
}

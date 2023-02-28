package baekjoon;
import java.io.*;
import java.util.*;

public class Main2667 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int[][] board;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<N;j++) {
				board[i][j] = s.charAt(j)-'0';
			}
		}
		
		bfs();
	}
	
	static class Point {
		Point(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
		int row, col, dist;
	}
	
	static int bfs() {
		int count = 0;
		boolean[][] visited = new boolean[N][N];
		Queue<Point> q = new LinkedList<Point>();
		q.offer(new Point(0,0,0));
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			if(curr.row == N-1 && curr.col == N) {
				
			}
			for(int i=0;i<4;i++) {
				int nr = curr.row + D[i][0];
				int nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1)
					continue;
				if(board[nr][nc] == 0)
					continue;
				if(visited[nr][nc])
					continue;
				
				
				visited[nr][nc] = true;
				q.offer(new Point(nr,nc,curr.dist+1));
			}
			/*
			if(q.isEmpty()) {
				if(curr.row < N-1) {					
					q.offer(new Point(curr.row+2))
				}
			}
			*/
		}
		System.out.println();
		return -1;
	}
	
}

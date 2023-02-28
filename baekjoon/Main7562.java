package baekjoon;
import java.io.*;
import java.util.*;

public class Main7562 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int I;
	static int[][] D  = {{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
	static int endRow, endCol;
	
	static class Point{
		Point(int sr, int sc, int d){
			startRow = sr;
			startCol = sc;
			dist = d;
		}
		int startRow, startCol, dist;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			I = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int sr = Integer.parseInt(st.nextToken());
			int sc = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			endRow = Integer.parseInt(st.nextToken());
			endCol = Integer.parseInt(st.nextToken());
			
			System.out.println(bfs(new Point(sr,sc,0)));
			
		}
	}
	
	static int bfs(Point point) {
		boolean[][] visited = new boolean[I][I];
		Queue<Point> q = new LinkedList<>();
		visited[point.startRow][point.startCol] = true;
		q.offer(point);
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			
			if(curr.startRow == endRow && curr.startCol == endCol) {
				return curr.dist;
			}
			
			for(int i = 0; i<8;i++) {
				int nr = curr.startRow + D[i][0];
				int nc = curr.startCol + D[i][1];
				
				if(nr < 0 || nr > I-1 || nc < 0 || nc > I-1)
					continue;
				if(visited[nr][nc])
					continue;
				
				visited[nr][nc] = true;
				q.offer(new Point(nr,nc,curr.dist+1));
				
			}
		}
		return -1;
	}
}

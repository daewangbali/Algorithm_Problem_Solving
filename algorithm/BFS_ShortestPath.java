package algorithm;
import java.io.*;
import java.util.*;

public class BFS_ShortestPath {
	//sRow , sCol : 시작 행과 열 위치 eRow, eCol : 도착 행과 열 위치
	static int bfs(int sRow, int sCol, int eRow, int eCol) {
		boolean[][] visited = new boolean[N][N];
		Queue<Point> q = new LinkedList<Point>();
		visited[sRow][sCol] = true;
		q.offer(new Point(sRow, sCol, 0));
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			if(curr.row == eRow && curr.col == eCol) {
				return curr.dist;
			}
			
			// 왜 0 ~ 4 범위냐면 좌표를 상하좌우로 움직히는 D[][]을 활용하기 위해
			for(int i = 0; i < 4 ; i++) {  
				int nr = curr.row + D[i][0]; // 현재 좌표 움직이기 (위,아래)
				int nc = curr.col + D[i][1]; // 현재 좌표 움직이기 (좌,우)
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) 
					continue;
				if(visited[nr][nc] == true)
					continue;
				if(board[nr][nc] == 1)
					continue;
				
				// 위의 3가지 경우에 해당하지 않으면
				visited[nr][nc] = true;
				q.offer(new Point(nr, nc, curr.dist + 1));
				
			}
		}
		return -1;
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int N;
	static int[][] board;
	static class Point{
		Point(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
		int row, col, dist;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int sRow = Integer.parseInt(st.nextToken());
		int sCol = Integer.parseInt(st.nextToken());
		int eRow = Integer.parseInt(st.nextToken());
		int eCol = Integer.parseInt(st.nextToken());
		System.out.println(bfs(sRow, sCol, eRow, eCol));
	
	}	
}
	
		


package algorithm;
import java.io.*;
import java.util.*;

public class FloodFill {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int N;
	static int[][] board;
	public static void main(String[] args) throws IOException {
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
		
		fill(sRow, sCol);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void fill(int r, int c) {
		if(r < 0 || r > N-1 || c < 0 || c > N-1) 
			return;
		if(board[r][c] != 0)
			return;
		
		board[r][c] = 1;
		
		fill(r - 1, c);
		fill(r + 1, c);
		fill(r, c - 1);
		fill(r, c + 1);
		
	}
}

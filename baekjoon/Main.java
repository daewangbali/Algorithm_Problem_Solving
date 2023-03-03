package baekjoon;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int countDanji;
	static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	static int[][] board;
	
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<N ; j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(board[i][j] ==1) {
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
	
	static void dfs(int start, int end) {
		board[start][end] = 0;
		countDanji++;
		
		for(int i=0;i<4;i++) {
			int nr = start + D[i][0];
			int nc = end + D[i][1];
			
			if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) 
				continue;
			if(board[nr][nc] == 1)
				dfs(nr,nc);
		}
	}
}

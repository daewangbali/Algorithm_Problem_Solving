package algorithm;
import java.io.*;
import java.util.*;

public class DFS_Practice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int N, M;
	static int[][] graph = new int[1000][1000];
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};	
	static boolean dfs(int x, int y) {
		//�־��� ������ ����� ��쿡�� ��� ����
		if(x <= -1 || x >= N || y <= -1 || y >= M) {
			return false;
		}
		//���� ��尡 ���� �湮���� ���� �����
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			//��, ��, ��, ���� ��ġ�鵵 ��� ��������� ȣ��
			dfs(x - 1 , y);
			dfs(x + 1 , y);
			dfs(x , y - 1);
			dfs(x , y + 1);
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<M ; j++) {
				graph[i][j] = s.charAt(j)-'0';
			}
		}
		
		//��� ���(��ġ)�� ���Ͽ� ����� ä���
		int result = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(dfs(i,j)) {
					result += 1;
				}
			}
		}
		System.out.println(result);
	}
}
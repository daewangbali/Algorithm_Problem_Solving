package algorithm;
import java.io.*;
import java.util.*;

class Node {
	private int x;
	private int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class BFS_Practice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N,M;
	static int[][] graph = new int[201][201];
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x,y));
		//ť�� �� ������ �ݺ��ϱ�
		while(!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			//���� ��ġ���� 4���� ���������� ��ġ Ȯ��
			for(int i=0 ; i<4 ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				//�̷� ã�� ������ ��� ��� ����
				if(nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				//���� ��� ����
				if(graph[nx][ny] == 0)
					continue;
				//�ش� ��带 ó�� �湮�ϴ� ��쿡�� �ִ� �Ÿ� ���
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}
		}
		
		// ���� ������ �Ʒ������� �ִ� �Ÿ� ��ȯ
        return graph[N - 1][M - 1];
	}
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<M ; j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs(0,0));
		
	}
}

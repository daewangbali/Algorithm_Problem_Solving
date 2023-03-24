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
		//큐가 빌 때까지 반복하기
		while(!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			//현재 위치에서 4가지 방향으로의 위치 확인
			for(int i=0 ; i<4 ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				//미로 찾기 공간을 벗어난 경우 무시
				if(nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				//벽인 경우 무시
				if(graph[nx][ny] == 0)
					continue;
				//해당 노드를 처음 방문하는 경우에만 최단 거리 기록
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}
		}
		
		// 가장 오른쪽 아래까지의 최단 거리 반환
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

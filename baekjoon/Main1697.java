package baekjoon;
import java.io.*;
import java.util.*;

public class Main1697 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int N,K;
	static int[] visited = new int[100001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		System.out.println(bfs(N));
		
	}
	
	static int bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		
		while(!q.isEmpty()) {
			
			int curr = q.poll();
			
			if(curr == K)
				return visited[K];
			
			for(int i=0;i<3;i++) {
				int temp;
				if(i == 0)
					temp = curr - 1;
				else if(i == 1)
					temp = curr + 1;
				else
					temp = curr * 2;
					
				if(temp < 0 || temp >= visited.length || visited[temp] != 0)
					continue;
				
				q.offer(temp);
				visited[temp] = visited[curr] + 1;
				
			}
			
			
			
		
			/*
			 * 
			 * 
			if (curr-1 >= 0 && visited[curr-1] == 0){
				visited[curr-1] = visited[curr] + 1;
				q.offer(curr-1);
			}
			if (curr+1 < visited.length && visited[curr+1] == 0){
				visited[curr+1] = visited[curr] + 1;
				q.offer(curr+1);
			}
			if (2*curr < visited.length && visited[2*curr] == 0){
				visited[2*curr] = visited[curr] + 1;
				q.offer(2*curr);
			}
			
			
			for(int i=0;i<3;i++) {
				int temp;
				if(i == 0)
					temp = curr - 1;
				else if(i == 1)
					temp = curr + 1;
				else
					temp = curr * 2;
					
				if(temp < 0 || temp >= visited.length || visited[temp] != 0)
					continue;
				
				q.offer(temp);
				visited[temp] = visited[curr] + 1;
				
			}
			
			
			int before = curr.num - 1;
			int next = curr.num + 1;
			int jump = curr.num * 2;
			
			if(before == K || next == K || jump == K)
				return curr.count+1;
			
			if(before > 0 && before < bigger && !visited[before])
				q.offer(new Point (before,curr.count + 1));
			
			if(next > 0 && next < bigger && !visited[next])
				q.offer(new Point (next,curr.count + 1));
			
			if(jump > 0 && jump < bigger && !visited[jump])
				q.offer(new Point (jump,curr.count + 1));
		
		*/
		}
		return 0;
	}
	
}

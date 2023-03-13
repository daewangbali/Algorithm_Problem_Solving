package algorithm;
import java.io.*;
import java.util.*;

public class Implementation_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] move = {"L", "R" , "U" , "D"};
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		int N = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String m = st.nextToken();
			int nx = -1 ,ny = -1;
			for(int j=0 ; j<4 ; j++) {
				if(m.equals(move[j])) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			if(nx < 1 || nx > N || ny < 1 || ny > N)
				continue;
			x = nx;
			y = ny;
		}
		System.out.println(x + " " + y);
		
	}
}

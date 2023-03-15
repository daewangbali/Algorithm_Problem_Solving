package algorithm;
import java.io.*;

public class Implementation3_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String n = br.readLine();
		//나이트가 이동할 수 있는 8가지 방향 정의
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy= {-1, -2, -2, -1, 1, 2, 2, 1};
		
		int row = n.charAt(1)-'0';
		int column = n.charAt(0)-'a' + 1;
		
		int count = 0;
		//8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		for(int i=0 ; i<8 ; i++) {
			//이동하고자 하는 위치 확인
			int nr = row + dx[i];
			int nc = column + dy[i];
			//해당 위치로 이동이 가능하다면 카운트 증가
			if(nr > 0 && nc > 0 && nr <= 8 && nc <=8)
				count++;
		}
		System.out.println(count);
	}
}

package algorithm;
import java.io.*;

public class Implementation3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String n = br.readLine();
		int[][] move = {{-1,-2},{-1,2},{1,2},{1,-2},{-2,-1},{-2,1},{2,-1},{2,1}};
		int row = n.charAt(1)-'0';
		int col = n.charAt(0)-'a' + 1;
		int count = 0;
		
		for(int i=0 ; i<move.length ; i++) {
			int nr = row + move[i][0];
			int nc = col + move[i][1];
			if(nr > 0 && nc > 0 && nr <= 8 && nc <=8)
				count++;
		}
		
		System.out.println(count);
		
	}
}

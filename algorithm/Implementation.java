package algorithm;
import java.io.*;
import java.util.*;

public class Implementation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			String m = st.nextToken();
			switch(m) {
			case "L":
				if(y-1 > 0) {					
					y -= 1;
				}
			case "R":
				if(y+1 <= N) {					
					y += 1;
				}
			case "U":
				if(x-1 > 0) {					
					x -= 1;
				}
			case "D":
				if(x+1 <= N) {					
					x += 1;
				}
			}
		}
		System.out.println(x + " " + y);
		
	}
}

package baekjoon;
import java.io.*;
import java.util.*;

public class Main10250 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken());//W는 필요없으므로 선언안함
			int N = Integer.parseInt(st.nextToken());
			int X,Y=0;
			if((N%H)==0) {
				Y = H * 100;
				X = N/H;
			}else {
				Y = N%H * 100;
				X = (N/H)+1;
			}
			int YYXX = Y+X;
			System.out.println(YYXX);
		}
	}
}

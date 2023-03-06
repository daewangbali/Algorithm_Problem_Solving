package baekjoon;
import java.io.*;
import java.util.*;

public class Main5086 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0)
				break;
			
			if(b % a == 0) {
				sb.append("factor");
			}else if(a % b == 0) {
				sb.append("multiple");
			}else {
				sb.append("neither");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
}

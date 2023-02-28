package baekjoon;
import java.io.*;
import java.util.*;

public class Main2675 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int tc = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				for(int k=0;k<tc;k++) {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

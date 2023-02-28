package baekjoon;
import java.io.*;
import java.util.*;

public class Main1712 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int x = 0;
		if(C<=B) {
			x = -1;
		}else {
			x = (A / (C-B)) + 1;
		}
		System.out.println(x);
	}
}

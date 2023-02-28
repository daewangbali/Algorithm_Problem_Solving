package baekjoon;
import java.io.*;
import java.util.*;

public class Main2869 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int count = ((V-B)/(A-B));
		if(((V-B)%(A-B)!=0)) {
			count++;
		}
		System.out.println(count);
	}
}

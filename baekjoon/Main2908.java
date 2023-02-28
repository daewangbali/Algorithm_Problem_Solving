package baekjoon;
import java.io.*;
import java.util.*;

public class Main2908 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb.append(st.nextToken()).reverse();
		sb2.append(st.nextToken()).reverse();
		if(sb.compareTo(sb2)>0) {
			System.out.println(sb);
		}else {
			System.out.println(sb2);
		}
		
		/*
		st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		for(int i=0;i<3;i++) {
			
		}
		*/
		
		
	}
}

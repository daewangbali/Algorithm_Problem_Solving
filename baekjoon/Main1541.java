package baekjoon;
import java.io.*;
import java.util.*;

public class Main1541 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(),"-");
		int result = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정 
		while(st.hasMoreTokens()) {
			int num = 0;
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");
			while(st2.hasMoreTokens()) {
				num += Integer.parseInt(st2.nextToken());
			}
			if (result == Integer.MAX_VALUE) {
				result = num;
			} else {
				result -= num;
			}
		}
		System.out.println(result);
	}
}

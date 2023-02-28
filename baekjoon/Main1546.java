package baekjoon;

import java.io.*;
import java.util.*;

public class Main1546 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int max = 0;
		float sum = 0;
		int[] array = new int[T];
		float num = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<T;i++) {
			int tc = Integer.parseInt(st.nextToken());
			array[i] = tc;
			if(max < tc) {
				max = tc;
			}
		}
		 for(int i=0;i<T;i++) { 
			 num = array[i]; // 배열값을 변수에 할당하기!! 이거 때문에 계속 오류남ㅜ
			 sum = sum + num/max*100 ;
		}
		 System.out.println(sum/T);
	}
}

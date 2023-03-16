package baekjoon;
import java.io.*;
import java.util.*;

public class Main2503 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int q = Integer.parseInt(br.readLine());
		int[] ans = new int[988];
		int count = 0;
		for(int i=0 ; i<q ; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j=123 ; j<=987 ; j++) {
				int s1 = 0;
				int b1 = 0;
				if(j / 100 == 0 || (j / 10) % 10 == 0 || j % 10 ==0 )
					continue;
				if((j / 100 == (j / 10) % 10) || (j / 100 == (j % 10)) || (j / 10) % 10 == (j % 10))
					continue;
				if((j / 100 == (j / 10) % 10 && j % 10 == (j / 10) % 10))
					continue;
				
				if((num / 100) == (j / 100)) {
					s1++;
				}
				if(((num / 10) % 10) == ((j / 10) % 10)) {
					s1++;
				}
				if((num % 10) == (j % 10)) {
					s1++;
				}
				
				if((num / 100) == ((j / 10) % 10) || (num / 100) == (j % 10)) {
					b1++;
				}
				if(((num / 10) % 10) == (j / 100) || ((num / 10) % 10) == (j % 10)) {
					b1++;
				}
				if((num % 10) == (j / 100) || (num % 10) == ((j / 10) % 10)) {
					b1++;
				}
				
				if(s == s1 && b == b1) {
					ans[j]++;
				}
			
			}
		}

		for(int i=123;i<=987 ; i++) {
			if(ans[i] == q) {
				count++;
			}
		}
		System.out.println(count);
	}
}

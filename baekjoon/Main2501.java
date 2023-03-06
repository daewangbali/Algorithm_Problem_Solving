package baekjoon;
import java.io.*;
import java.util.*;

public class Main2501 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for(int i=1 ; i<=N/2 ; i++) {
			if(N % i == 0) {
				factors.add(i);
			}
		}
		factors.add(N);
		
		if(factors.size() < k) {
			System.out.println(0);
		}else {
			System.out.println(factors.get(k-1));
		}
	}
			
}

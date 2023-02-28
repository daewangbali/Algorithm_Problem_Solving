package baekjoon;
import java.io.*;

public class Main10872 {
	static int factorial(int N) {
		if(N == 0) {
			return 1;
		}else {
			return N * factorial(N-1);
		}
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException { 
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
	}
}

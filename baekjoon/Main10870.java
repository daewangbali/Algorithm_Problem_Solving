package baekjoon;
import java.io.*;

public class Main10870 {
	static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
}
